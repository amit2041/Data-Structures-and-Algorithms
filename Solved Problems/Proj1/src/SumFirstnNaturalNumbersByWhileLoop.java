import java.util.Scanner;
public class SumFirstnNaturalNumbersByWhileLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		int i = 1;
		int sum = 0;
		while(i<=n) {
			sum = sum+i;
			i = i+1;
		}
		System.out.println(sum);
	}

}
