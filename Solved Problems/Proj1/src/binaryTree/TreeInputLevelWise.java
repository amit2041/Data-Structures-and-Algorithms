package binaryTree;
import java.util.*;
import java.util.Queue;
import java.util.Scanner;

public class TreeInputLevelWise {
	
	 	public static BinaryTreeNode<Integer> levelWiseInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Root Data: ");
        int rootData = s.nextInt(); // Taking root's data input
        if (rootData == -1) return null; // User doesn't want to enter anything.
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
//        Queue of BinaryTreeNode type
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChildren.add(root); // adding root in the queue
//        Till the queue is not empty taking input
        while (!pendingChildren.isEmpty()) {
        	BinaryTreeNode<Integer> front = pendingChildren.remove();
//            Asking for left child of front
            System.out.print("Enter left child of " + front.data + ": ");
            int leftData = s.nextInt();
            if (leftData != -1) {
            	BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftData);
                front.left = leftChild;
                pendingChildren.add(leftChild);
            }
//            Asking for right child of front
            System.out.print("Enter right child of " + front.data + ": ");
            int rightData = s.nextInt();
            if (rightData != -1) {
            	BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightData);
                front.right = rightChild;
                pendingChildren.add(rightChild);
            }
        }
        return root;
    }

    public static void levelWisePrintBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null) return;

        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChildren.add(root);

        while (!pendingChildren.isEmpty()) {
        	BinaryTreeNode<Integer> front = pendingChildren.remove();
            if (front == null) {
                if (!pendingChildren.isEmpty()) {
                    pendingChildren.add(null);
                }
            } else {
                System.out.print(front.data + " : L ");
//                For Left Child
                if (front.left != null) {
                    pendingChildren.add(front.left);
                    System.out.print(front.left.data + ", R ");
                } else {
                    System.out.print("null" + ", R ");
                }
//                For Right Child
                if (front.right != null) {
                    pendingChildren.add(front.right);
                    System.out.print(front.right.data);
                } else {
                    System.out.print("null");
                }
            }
            System.out.println();
        }
    }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = levelWiseInput();
        levelWisePrintBinaryTree(root);

	}

}
