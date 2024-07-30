package queues;

public class QueueUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();
		int arr[] = {10, 20, 30, 40, 50};
		for(int elem : arr) {
			queue.enqueue(elem);
		}
		
		while(! queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
		
	}

}
