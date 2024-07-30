import java.util.Scanner;
public class FahrenhiteToCelsiusByWhileLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int S, E, W;
		S = s.nextInt();
		E = s.nextInt();
		W = s.nextInt();
		int fah;
		while(S<=E) {
			fah = (5*(S-32)/9);
			System.out.println(S+" "+fah);
			S = S+W;
		}

	}

}
