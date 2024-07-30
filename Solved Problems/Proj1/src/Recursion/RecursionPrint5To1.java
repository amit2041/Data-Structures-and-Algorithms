package Recursion;

public class RecursionPrint5To1 {
	public static void printNumb(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printNumb (n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		printNumb (n);

	}

}
