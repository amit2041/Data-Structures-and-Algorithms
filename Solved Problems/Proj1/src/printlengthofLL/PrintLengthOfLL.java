package printlengthofLL;

import createlinkedlist2.Node3;

public class PrintLengthOfLL {
	
	public static Node4<Integer>createLinkedList(){
		Node4<Integer> n1 = new Node4<>(10);
		Node4<Integer> n2 = new Node4<>(20);
		Node4<Integer> n3 = new Node4<>(30);
		Node4<Integer> n4 = new Node4<>(40);
		
		n1.next = n2;
		
		n2.next = n3;
		
		n3.next = n4;
		
		return n1;
	}
	public static void Print(Node4<Integer> head) {
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
		
	}
	
	public static int length (Node4<Integer>head) {
		int count = 1;
		while(head.next!=null) {
			head = head.next;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node4<Integer>head = createLinkedList();
			Print(head);
	// Print Length Of LL		
			int t = 1;
	        System.out.println(length(head));
	        }
	}


