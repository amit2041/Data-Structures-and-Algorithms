package binaryTree;

import java.util.Scanner;

public class PrintNodesAtDepthK {
	
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
	public static int largest(BinaryTreeNode<Integer>root) {
		if(root==null) {
			return -1;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);
		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}
	
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
	    //Your code goes here
        
        printKDistanceNode(root, node, k);
        
	}
    
    private static void printKDistanceFromRoot(BinaryTreeNode<Integer> node, int k){
        if(node == null || k<0)
            return;
        
        if(k == 0){
            System.out.println(node.data);
            return;
        }   
        printKDistanceFromRoot(node.left, k-1);
        printKDistanceFromRoot(node.right, k-1);
    }
    
    private static int printKDistanceNode(BinaryTreeNode<Integer> root, int node, int k)
    {
        if(root == null)
            return -1;
        
        if(root.data == node){
            printKDistanceFromRoot(root, k);
            return 0;
        }
        int dl = printKDistanceNode(root.left, node, k);
        if(dl != -1){
            if(dl+1 == k)
                System.out.println(root.data);
            else
            	printKDistanceFromRoot(root.right, k-dl-2);
            return 1+dl;
        }
        
        int rd = printKDistanceNode(root.right, node, k);
        if(rd != -1){
            if(rd + 1 == k)
                System.out.println(root.data);
            else
                printKDistanceFromRoot(root.left, k-rd-2);
            return 1 + rd;
        }
        return -1;
	}
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		printTreeDetailed(root);
		System.out.println("Num of Nodes "+ numNodes(root));
		printKDistanceFromRoot(root);
	}

}
