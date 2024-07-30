import java.util.Scanner;
public class CheckPrimeByFunction {
	public static boolean checkPrime(int n) {
		int div = 2;
		while(div<=n/2) {
			if(n%2==0) {
				return false;
			}
			div = div+1;
		}
		return true;
	}
	
	public static boolean checkPrime2(int n) {
		int div = 2;
		boolean isPrime = true;
		while(div<=n/2) {
			if(n%2==0) {
				isPrime = false;
				break;
			}
			div = div+1;
		}
		if(isPrime) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		boolean isPrime = checkPrime2(n);
		System.out.println(isPrime);
	}

}
