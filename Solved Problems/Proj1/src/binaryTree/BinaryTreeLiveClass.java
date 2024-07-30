package binaryTree;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

// BinaryTreeNode class already define in binary tree package
//class BinaryTreeNode {
  //  int data;
  //  BinaryTreeNode left;
  //  BinaryTreeNode right;
//
  //  BinaryTreeNode(int val){
  //      data = val;
  //  }
//}

public class BinaryTreeLiveClass {
	
	public static BinaryTreeNode inputBT(){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the root data");
	    int rootData = sc.nextInt();
	    BinaryTreeNode root = new BinaryTreeNode(rootData);
	    Queue<BinaryTreeNode> qu = new LinkedList<>();
	    qu.add(root);

	    while(!qu.isEmpty()){
	        int size = qu.size();
	        while(size>0){
	        BinaryTreeNode front = qu.poll();
	        System.out.println("Enter left child for"+ front.data);
	        int leftData = sc.nextInt();
	        if(leftData!= -1){
	            BinaryTreeNode leftChild = new BinaryTreeNode(leftData);
	            front.left = leftChild;
	            qu.add(leftChild);
	        }    

	        System.out.println("Enter right child for"+ front.data);
	        int rightData = sc.nextInt();
	        if(rightData!= -1){
	            BinaryTreeNode rightChild = new BinaryTreeNode(rightData);
	            front.right = rightChild;
	            qu.add(rightChild);
	        }    
	        size--;
	        }
	    }
	    return root;
	}

	public static void printBT(BinaryTreeNode root){
	    Queue<BinaryTreeNode> qu = new LinkedList<>();
	    qu.add(root);

	    while(!qu.isEmpty()){
	        int size = qu.size();
	        while(size>0){
	        BinaryTreeNode front = qu.poll();
	        System.out.print(front.data+" ");
	        if(front.left!= null){
	            qu.add(front.left);
	        }    
	        if(front.right!= null){
	            qu.add(front.right);
	        }    
	        size--;
	    }
	    System.out.println();
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode root = inputBT();
	    printBT(root);

	}

}
