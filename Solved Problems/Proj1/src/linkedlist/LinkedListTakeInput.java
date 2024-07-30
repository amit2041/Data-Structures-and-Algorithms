package linkedlist;
import java.util.Scanner;
public class LinkedListTakeInput {
	
	public static void print(Node6<Integer> head) {
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
		
	}
	
	public static Node6<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node6<Integer> head = null;
		while(data!=-1) {
			Node6<Integer> currentNode6 = new Node6<Integer> (data);
			if(head==null) {
				head = currentNode6;
			}else {
				Node6<Integer> tail = head;
				while(tail.next!=null) {
					tail = tail.next;
				}
				tail.next = currentNode6;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node6<Integer>head = takeInput();
		print(head);

	}

}
