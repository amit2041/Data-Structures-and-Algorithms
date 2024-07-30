import java.util.Scanner;
public class Conditional_and_AND_Operators {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		a = s.nextInt();
		b = s.nextInt();
		if(a>0 && b>0) {
			System.out.println("Both are Positive");
		}
		else {
			System.out.println("Both are not Positive");
		}

	}

}
