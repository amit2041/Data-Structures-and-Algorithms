package dsaSkillTest;
import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class frequencyPalindrome {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        while (t-- > 0) {
            String[] nodes = scanner.nextLine().split(" ");
            TreeNode root = buildTree(nodes);
            int target = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            bomb(root, target);
        }
    }

    public static TreeNode buildTree(String[] nodes) {
        if (nodes.length == 0) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        queue.offer(root);

        for (int i = 1; i < nodes.length; ) {
            TreeNode curr = queue.poll();

            String leftVal = nodes[i++];
            if (!leftVal.equals("-1")) {
                TreeNode left = new TreeNode(Integer.parseInt(leftVal));
                curr.left = left;
                queue.offer(left);
            }

            String rightVal = nodes[i++];
            if (!rightVal.equals("-1")) {
                TreeNode right = new TreeNode(Integer.parseInt(rightVal));
                curr.right = right;
                queue.offer(right);
            }
        }
        return root;
    }

    public static void bomb(TreeNode root, int target) {
        Map<Integer, List<Integer>> levels = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        findAndDestroy(root, target, levels);

        for (int level = 1; levels.containsKey(level); level++) {
            List<Integer> destroyedNodes = levels.get(level);
            Collections.sort(destroyedNodes);
            for (int node : destroyedNodes) {
                result.add(node);
            }
        }

        for (int node : result) {
            System.out.println(node);
        }
    }

    public static void findAndDestroy(TreeNode root, int target, Map<Integer, List<Integer>> levels) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;

            List<Integer> destroyedNodes = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                destroyedNodes.add(node.val);

                if (node.val == target) {
                    levels.put(level, destroyedNodes);
                    return;
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            levels.put(level, destroyedNodes);
        }
    }
}