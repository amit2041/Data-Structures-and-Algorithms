import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String binary = s.next();
		// Convert Binary to Decimal
		int decimal = Integer.parseInt(binary, 2);
		System.out.println(decimal);
	}

}
