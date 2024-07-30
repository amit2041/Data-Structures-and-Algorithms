package linkedlist;
import java.util.Scanner;
public class InsertNodeInLL {
		
	public static void print(Node7<Integer>head) {
			while(head!=null) {
				System.out.println(head.data);
				head = head.next;
			}
			
		}
	
	public static Node7<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node7<Integer> head = null;
		while(data!=-1) {
			Node7<Integer> currentNode6 = new Node7<Integer> (data);
			if(head==null) {
				head = currentNode6;
			}else {
				Node7<Integer> tail = head;
				while(tail.next!=null) {
					tail = tail.next;
				}
				tail.next = currentNode6;
			}
			data = s.nextInt();
		}
		return head;
	
	}
	
	public static void insert(Node7<Integer>head, int elem, int pos) {
		
		Node7<Integer>nodeToBeInserted = new Node7<Integer>(elem);
		int count = 0;
		Node7<Integer>prev = head;
		while(count<pos-1 && prev!= null) {
			count++;
			prev = prev.next;
		}
		if(prev!=null) {
			nodeToBeInserted.next = prev.next;
			prev.next = nodeToBeInserted;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node7<Integer>head = takeInput();
		insert(head, 80, 2);
		print(head);

	}

}
