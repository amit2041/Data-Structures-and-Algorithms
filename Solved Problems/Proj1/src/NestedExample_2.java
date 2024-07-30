import java.util.Scanner;
public class NestedExample_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		a = s.nextInt();
		b = s.nextInt();
		if(a>b) {
			System.out.println("First is Greater");
		}
		if(b>a) {
			System.out.println("Second is Greater");
		}
		if(a==b) {
			System.out.println("Both are Equal");
		}

	}

}
