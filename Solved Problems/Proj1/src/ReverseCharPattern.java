import java.util.Scanner;
public class ReverseCharPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n){
			int j = 1;
			while(j<=i){
			char jthChar = (char)('A'+n-j);
				System.out.print(jthChar);
				j = j+1;
			}
			System.out.println();
			i = i+1;
		}

	}

}
