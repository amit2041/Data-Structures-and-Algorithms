package createlinkedlist2;

public class LinkedListUse2 {
	
	public static Node3<Integer>createLinkedList(){
		Node3<Integer> n1 = new Node3<>(10);
		Node3<Integer> n2 = new Node3<>(20);
		Node3<Integer> n3 = new Node3<>(30);
		Node3<Integer> n4 = new Node3<>(40);
		
		n1.next = n2;
		
		n2.next = n3;
		
		n3.next = n4;
		
		return n1;
	}
	public static void Print(Node3<Integer> head) {
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node3<Integer>head = createLinkedList();
	//	System.out.println(" main "+ head);
		Print(head);

	}

}
