package createlinkedlist;

public class LinkedListUse {
	
	public static Node2<Integer>createLinkedList(){
		Node2<Integer> n1 = new Node2<>(10);
		Node2<Integer> n2 = new Node2<>(20);
		Node2<Integer> n3 = new Node2<>(30);
		Node2<Integer> n4 = new Node2<>(40);
		
		n1.next = n2;
	//	System.out.println("n1 " + n1 +" data " + n1.data +" next " +n1.next);
		n2.next = n3;
	//	System.out.println("n2 " + n2 +" data " + n2.data +" next " +n2.next);
		n3.next = n4;
	//	System.out.println("n3 " + n3 +" data " + n3.data +" next " +n3.next);
	//	System.out.println("n4 " + n4 +" data " + n4.data +" next " +n4.next);
		
		return n1;
	}
	public static void Print(Node2<Integer> head) {
		System.out.println(" Print "+head);
		System.out.println(head.data);
		System.out.println(head.next);
		System.out.println(head.next.data);
		System.out.println(head.next.next.data);
		System.out.println(head.next.next.next.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node2<Integer>head = createLinkedList();
		System.out.println(" main "+ head);
		Print(head);
	}

}
