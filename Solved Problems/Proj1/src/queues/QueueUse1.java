package queues;

public class QueueUse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueMakingDynamically queue = new QueueMakingDynamically();
		int arr[] = {10, 20, 30, 40, 50};
		for(int elem : arr) {
				queue.enqueue(elem);  // generate surround with try/catch
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
