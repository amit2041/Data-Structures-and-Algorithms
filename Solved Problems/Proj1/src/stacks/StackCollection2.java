package stacks;

import java.util.Stack;

public class StackCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		int arr[] = {5, 6, 7, 1, 9};
		for(int elem: arr) {
			stack.push(elem);
		}
		while(! stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
