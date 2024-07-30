import java.util.Scanner;
public class Conditional_and_NOT_Operator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		a = s.nextInt();
		b = s.nextInt();
		if(a!=b) {
			System.out.println("Not Equal");
		}
		else {
			System.out.println("Equal");
		}

	}

}
