import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int decimal = s.nextInt();

		String binary = Integer.toBinaryString(decimal);
		System.out.println(binary);

	}

}
