package queues;

public class QueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray queue = new QueueUsingArray();
		int arr[] = {10, 20, 30, 40};
		for(int elem : arr) {
			try {
				queue.enqueue(elem);  // generate surround with try/catch 
			} catch (QueueFullException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			}
		}
		while(! queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// will never reach here 
			}
		}

	}

}
