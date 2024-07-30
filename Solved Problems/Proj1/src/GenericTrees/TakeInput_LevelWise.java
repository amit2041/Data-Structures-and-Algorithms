package GenericTrees;
import java.util.Scanner;

import queues.QueueUsingLL;
public class TakeInput_LevelWise {
	
	public static TreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter the root data");
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> front = pendingNodes.dequeue();
			System.out.println("Enter the number of children for: "+front.data);
			int numChild = s.nextInt();
			for(int i = 0; i<numChild;i++) {
				System.out.println("Enter the "+ i +"th child data for: "+ front.data);
				int childData = s.nextInt();
				TreeNode<Integer> childNode = new TreeNode<> (childData);
				front.children.add(childNode);
				pendingNodes.enqueue(childNode);
			}
		}
		return root;
	}
	
	public static void printTree(TreeNode<Integer>root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+": ");
		for(int i = 0; i<root.children.size(); i++) {
			System.out.print(root.children.get(i).data+" ");
		}
		System.out.println();
		for(int i = 0; i<root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTree(child);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeNode<Integer>root = takeInput();
			printTree(root);
	}

}
