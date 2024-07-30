package stacks;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub
		StackUsingArray stack = new StackUsingArray();
	//	stack.data[1] = 100;
		stack.push(10);
		System.out.println(stack.top());
		stack.pop();
		stack.size();
		System.out.println(stack.isEmpty());

	}
		
	}
