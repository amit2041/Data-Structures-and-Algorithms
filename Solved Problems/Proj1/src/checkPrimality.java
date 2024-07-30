import java.util.Scanner;
public class checkPrimality {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		int div = 2;
		boolean isPrime = true;
		while(div<=n-1) {
			if(n%2==0) {
				isPrime = false;
			}
			div = div+1;
		}
		if(isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Compsite");
		}

	}

}
