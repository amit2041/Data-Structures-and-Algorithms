package arraysintro;
import java.util.Scanner;
public class FindSquareRoot {
	
	public static int sqrtN(long N) {
		if(N==1 || N==0){
			return (int) N;
		}

		long low = 2;
		long high = N;
		long mid;

		while(low< high) {
			mid = low + (high - low) / 2;

			if(mid <= (N/mid)) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}

		return (int) low - 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sr = new Scanner(System.in);
	        long n = sr.nextLong();
	        int ans = FindSquareRoot.sqrtN(n);
	        System.out.println(ans);

	}

}
