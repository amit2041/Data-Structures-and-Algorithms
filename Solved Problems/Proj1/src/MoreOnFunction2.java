import java.util.Scanner;
public class MoreOnFunction2 {
	public static double sum(int a, int b, double c) {
		double ans = a + b + c;
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		double num3 = s.nextDouble();
		double ans = sum(num1, num2, num3);
		System.out.println(ans);

	}

}
