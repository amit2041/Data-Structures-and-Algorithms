import java.util.Scanner;
public class moreOneFunction {
	public static int sum(int a, int b) {
		int ans = a+b;
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int ans = sum(num1, num2);
		System.out.println(ans);

	}

}
