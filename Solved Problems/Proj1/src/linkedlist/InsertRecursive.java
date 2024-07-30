package linkedlist;
import java.util.Scanner;
public class InsertRecursive {
	
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
	
	public static Node<Integer> insertR(Node<Integer>head, int elem, int pos){
		if(head == null && pos>0) {
			return head;
		}
		if(pos == 0) {
			Node<Integer>newNode = new Node<>(elem);
			newNode.next = head;
			return newNode;
		}else {
			head.next = insertR(head.next, elem, pos-1);
			return head;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head = takeInput();
		head = insertR(head, 20, 0);
	//	head = insertR(head, 20, 2);
	//	head = insertR(head, 20, 5);
		printR(head);

	}

}
