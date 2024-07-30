import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
	        int sqrt = 0;
	        while(sqrt*sqrt<=N) {
	        	sqrt = sqrt+1;
	            }
	        sqrt = sqrt-1;
	        System.out.println(sqrt);

	}

}
