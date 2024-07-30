package stacks;

public class StackUseLL {

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		StackUsinLL<Integer> stack = new StackUsinLL<>();
		int arr[] = {5, 6, 7, 1, 9};
		for(int i = 0; i<arr.length; i++) {
			stack.push(arr[i]);
		}
		while(! stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
