package BST1;

public class CheckIfBinaryTreeIsBST {
	
	public static BinaryTreeNode<Integer>buildTreeFromPreInHelper(int[]pre, int []in, int siPre, int eiPre, int siIn, int eiIn){
		if(siPre>eiPre) {
			return null;
		}
		int rootData = pre[siPre];
		BinaryTreeNode<Integer>root = new BinaryTreeNode<Integer>(rootData);
		int rootIndex= -1;
		for(int i = siIn; i<= eiIn; i++) {
			if(in[i]==rootData) {
				rootIndex = i;
				break;
			}
		}
		int siPreLeft = siPre+1;
		int siInLeft = siIn;
		int eiInLeft = rootIndex-1;
		int siInRight = rootIndex+1;
		int eiPreRight = eiPre;
		int eiInRight = eiIn;
		
		int leftSubtreeLength = eiInLeft - siInLeft +1;
		
		int eiPreLeft = siPreLeft + leftSubtreeLength-1;
		int siPreRight = eiPreLeft+1;
		
		BinaryTreeNode<Integer>left = buildTreeFromPreInHelper(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
		BinaryTreeNode<Integer>right = buildTreeFromPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);
		root.left = left;
		root.right = right;
		return root;
	}
	
	public static BinaryTreeNode<Integer>buildTreeFromPreIn(int pre[], int in[]){
		BinaryTreeNode<Integer>root = buildTreeFromPreInHelper(pre, in, 0, pre.length-1, 0, in.length-1);
		return root;
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
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {

		 if(root==null)
	                return true;
			      int max=maximum(root.left);
	            int min=minimum(root.right);
	             if(root.data<=max || root.data>min)
		             return false;

	             boolean ans1=isBST(root.left);
	             boolean ans2=isBST(root.right);
	             return(ans1&& ans2);

	         }
	         public static int maximum(BinaryTreeNode<Integer> root)
	         {
	             if(root==null)
	                 return Integer.MIN_VALUE;
	             return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));


	             }
	         public static int minimum(BinaryTreeNode<Integer> root)
	         {
	             if(root==null)
	                 return Integer.MAX_VALUE;
	             return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
	         }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in[] = {1, 2, 3, 4, 5, 6, 7};
		int pre[] = {4, 2, 1, 3, 6, 5, 7};
		BinaryTreeNode<Integer>root = buildTreeFromPreIn(pre, in);
		printTreeDetailed(root);
		 boolean ans = isBST(root);
	        
	        System.out.println(ans);

	}

}
