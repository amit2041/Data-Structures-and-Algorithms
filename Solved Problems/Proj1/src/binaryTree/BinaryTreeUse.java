package binaryTree;

public class BinaryTreeUse {
	
	public static void printTreeDetailed(BinaryTreeNode<Integer>root) {
		// Todo take care of base case
		if(root == null) {
			return;
		}
		System.out.print(root.data+":");
		if(root.left != null) {
			System.out.print("L"+ root.left.data+", ");
		}
		if(root.right!=null) {
			System.out.print("R"+ root.right.data);
		}
		System.out.println();
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	//public static void printTree(BinaryTreeNode<Integer>root) {
		// Todo take care of base case
	//	if(root == null) {
	//		return;
	//	}
	//	System.out.println(root.data);
	//	printTree(root.left);
	//	printTree(root.right);
	//	if(root.left != null) {
	//		printTree(root.left);
	//	}
	//	if(root.right != null) {
	//	printTree(root.right);
	//	}
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
		
		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
		root.left = rootLeft;
		root.right = rootRight;
		
		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
		rootLeft.right = twoRight;
		rootRight.left = threeLeft;
		printTreeDetailed(root);

	}

}
