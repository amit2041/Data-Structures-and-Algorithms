import java.util.Scanner;
public class ConditionalsStatements {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int a, b;
		a = s.nextInt();
		b = s.nextInt();
		if(a>b) {
			System.out.println("First Num is Greater");
		}
		else {
			System.out.println("Second Num is Greater");
		}
		System.out.println("Outside if else");
	}

}
