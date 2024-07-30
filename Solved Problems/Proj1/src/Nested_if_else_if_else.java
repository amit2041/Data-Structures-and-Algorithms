import java.util.Scanner;
public class Nested_if_else_if_else {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		a = s.nextInt();
		b = s.nextInt();
		if(a>b) {
			System.out.println("First num is Greater");
		}
		else if(b>a) {
			System.out.println("Second num is Greater");
		}
		else {
			System.out.println("Both are Equal");
		}
	}

}
