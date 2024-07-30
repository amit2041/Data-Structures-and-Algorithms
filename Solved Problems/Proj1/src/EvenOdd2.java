import java.util.Scanner;
public class EvenOdd2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		a = s.nextInt();
		if(a%2==0) {
			System.out.println(a + " is even ");
		}
		if(a%2==1) {
			System.out.println(a + " is odd ");
		}

	}

}
