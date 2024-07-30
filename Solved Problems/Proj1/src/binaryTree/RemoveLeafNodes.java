package binaryTree;

import java.util.Scanner;

public class RemoveLeafNodes {
	
	public static BinaryTreeNode<Integer>takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot) {
		System.out.println("Enter root data");
		}else {
			if(isLeft) {
				System.out.println("Enter left child of" + parentData);
			}else {
				System.out.println("Enter right child of" + parentData);
			}
		}
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer>leftchild= takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer>rightchild= takeTreeInputBetter(false, rootData, false);
		root.left = leftchild;
		root.right = rightchild;
		return(root);
	}
	
	public static void printTreeDetailed(BinaryTreeNode<Integer>root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+":");
		if(root.left!= null) {
			System.out.print("L"+ root.left.data+", ");
		}
		if(root.right!= null) {
			System.out.print("R"+ root.right.data);
		}
		System.out.println();
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	
	public static int numNodes(BinaryTreeNode<Integer>root) {
		if(root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);
		return 1+ leftNodeCount + rightNodeCount;
	}
	
	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}
		return numLeaves(root.left)+ numLeaves(root.right);
	}
	
	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer>root){
		if(root == null) {
			return null;
		}
		
		if(root.left == null && root.right == null) {
			return null;
		}
		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		printTreeDetailed(root);
		System.out.println("Num of Nodes "+ numNodes(root));
		System.out.println("num leaves "+ numLeaves(root));
		BinaryTreeNode<Integer> newRoot = removeLeaves(root);
		printTreeDetailed(newRoot);

	}

}
