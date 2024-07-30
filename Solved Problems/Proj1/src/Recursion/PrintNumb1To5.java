package Recursion;

public class PrintNumb1To5 {
public static void printNumb(int n) {
	if(n==6) {
		return;
	}
	System.out.println(n);
	printNumb (n+1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1;
		printNumb(n);

	}

}
