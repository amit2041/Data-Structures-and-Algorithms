package GenericTrees;

public class SumOfAllNodes {
	static int totalSum = 0;
	public static int sumOfAllNode(TreeNode<Integer> root){
		 totalSum += root.data;
       
       for(int i=0;i<=root.children.size()-1;i++){
           sumOfAllNode(root.children.get(i));
       }
       
       return totalSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer>root = new TreeNode<>(4);
		TreeNode<Integer>node1 = new TreeNode<>(2);
		TreeNode<Integer>node2 = new TreeNode<>(3);
		TreeNode<Integer>node3 = new TreeNode<>(1);
		TreeNode<Integer>node4 = new TreeNode<>(5);
		TreeNode<Integer>node5 = new TreeNode<>(6);
		
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		
		node2.children.add(node4);
		node2.children.add(node5);
		
		System.out.println(sumOfAllNode(root));
	}

}
