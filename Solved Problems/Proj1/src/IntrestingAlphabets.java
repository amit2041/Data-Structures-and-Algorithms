import java.util.Scanner;
public class IntrestingAlphabets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n){
			int j = 1;
			char jthChar = (char)('A'+n-i);
			while(j<=i){
			
				System.out.print(jthChar);
				jthChar++;
				j = j+1;
			}
			System.out.println();
			i = i+1;
		}

	}

}
