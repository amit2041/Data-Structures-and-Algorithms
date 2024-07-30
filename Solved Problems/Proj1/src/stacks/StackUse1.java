package stacks;

public class StackUse1 {

	public static void main(String[] args)throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub
		DoubleStackCapacity stack = new DoubleStackCapacity();
		int arr[] = {5, 6, 7, 1, 9};
		for(int i = 0; i<arr.length; i++) {
			stack.push(arr[i]);
		}
		while(! stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
