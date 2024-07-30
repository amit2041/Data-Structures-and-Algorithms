package linkedlist;

import createlinkedlist2.Node3;

public class IncreamentEveryElementLL {
	
	public static Node5<Integer>createLinkedList(){
		Node5<Integer> n1 = new Node5<>(10);
		Node5<Integer> n2 = new Node5<>(20);
		Node5<Integer> n3 = new Node5<>(30);
		Node5<Integer> n4 = new Node5<>(40);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		return n1;
	}
	public static void Print(Node5<Integer> head) {
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
		
	}
	
	public static void increament(Node5<Integer>head) {
		Node5<Integer> temp = head;
		while(temp!=null) {
			temp.data++;
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node5<Integer>head = createLinkedList();
		increament(head);
		Print(head);
	}

}
