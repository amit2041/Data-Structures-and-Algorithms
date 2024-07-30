import java.util.Scanner;
public class PrintOnlyFirstCharater {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = str.charAt(0);
		System.out.println(ch);
	}

}
