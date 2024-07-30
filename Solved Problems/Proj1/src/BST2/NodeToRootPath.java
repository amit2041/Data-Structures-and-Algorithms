package BST2;

import java.util.ArrayList;
import java.util.Scanner;

import binaryTree.BinaryTreeNode;

public class NodeToRootPath {
	
	public static BinaryTreeNode<Integer>takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot) {
		System.out.println("Enter root data");
		}else {
			if(isLeft) {
				System.out.println("Enter left child of " + parentData);
			}else {
				System.out.println("Enter right child of " + parentData);
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
	
	public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer>root, int x){
		if(root == null) {
			return null;
		}
		if(root.data==x) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		
		ArrayList<Integer> leftOutput = nodeToRootPath(root.left, x);
		if(leftOutput!=null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		
		ArrayList<Integer> rightOutput = nodeToRootPath(root.right, x);
		if(rightOutput!=null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		ArrayList<Integer> path = nodeToRootPath(root,8); // 8 is value of x
		if(path == null) {
			System.out.println("Not Found");
		}else {
			System.out.print("Node to Root Path is"+": ");
			for(int i: path) {
				System.out.print(i);
			}
		}

	}

}
