package stacks;

public class StackUsingArray {
	
	
	private int data[];
	private int topIndex;  // index of the top most element of the stack
	
	public StackUsingArray() {
		data = new int[10];
		topIndex = -1;
		
	}
	
	//O(1)
	public int size() {
		return topIndex + 1;
		
	}
	
	//O(1)
	public boolean isEmpty()
	{
	//	if(topIndex == -1) {
	//		return true;
	//	}else {
	//		return false;
	//	}
		
		return topIndex == -1;
		
	}
	
	//O(1)
	public void push(int elem) throws StackFullException {
		// if stack is full
		if(topIndex == data.length-1) {
	//		StackFullException e = new StackFullException();
	//		throw e;
			throw new StackFullException();
			// throw exception
		}
	//	topIndex++;
		data[++topIndex] = elem;
		
	}
	
	//O(1)
	public int top() throws StackEmptyException {
		if(topIndex == -1) {
			// throw StackEmptyException
			throw new StackEmptyException();
		}
		return data[topIndex];
		
	}
	
	//O(1)
	public int pop() throws StackEmptyException {
		if(topIndex == -1) {
			// throw StackEmptyException
			throw new StackEmptyException();
		}
		int temp = data[topIndex];
		topIndex--;
		return temp;
		
	}

}
