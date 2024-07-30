package linkedlist;
import java.util.Scanner;
public class PrintRecursive {
	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null;
		while(data!=-1) {
			Node<Integer> currentNode = new Node<Integer> (data);
			if(head==null) {
				head = currentNode;
			}else {
				Node<Integer> tail = head;
				while(tail.next!=null) {
					tail = tail.next;
				}
				tail.next = currentNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void printR(Node<Integer>head) {
		if(head==null) {
			return;
		}
		System.out.print(head.data+" ");
		printR(head.next);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head = takeInput();
		printR(head);

	}

}
