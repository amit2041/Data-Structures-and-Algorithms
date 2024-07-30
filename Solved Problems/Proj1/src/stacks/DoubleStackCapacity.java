package stacks;

public class DoubleStackCapacity {
	private int data[];
	private int topIndex;  // index of the top most element of the stack
	
	public DoubleStackCapacity() {
		data = new int[2];
		topIndex = -1;
		
	}
	public DoubleStackCapacity(int size) {
		data = new int[size];
		topIndex = -1;
		
	}
	
	//O(1)
	public int size() {
		return topIndex + 1;
		
	}
	
	//O(1)
	public boolean isEmpty()
	{
	return topIndex == -1;
		
	}
	
	//O(1)
	public void push(int elem) throws StackFullException {
		// if stack is full
		if(topIndex == data.length-1) {
			doubleCapacity();
		}
		data[++topIndex] = elem;
		
	}
	private void doubleCapacity() {
		System.out.println("Double Capacity");
		int temp[] = data;
		data = new int [2*temp.length];
		for(int i = 1; i<temp.length; i++) {
			data[i] = temp[i];
		}
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
