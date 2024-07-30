import java.util.Scanner;
public class Conditional_and_OR_Operator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		a = s.nextInt();
		b = s.nextInt();
		if(a>0 || b>0) {
			System.out.println("one is Positive");
		}
		else {
			System.out.println("None is Positive");
		}

	}

}
