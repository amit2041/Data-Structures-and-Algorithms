package dsaSkillTest;
import java.util.Scanner;
public class numberStarPattern {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        for (int i = N; i >0; i--) {
	            for (int j = N; j >0; j--) {
	                if (i+1 <= N-j+1) System.out.print("*");
	                else System.out.print(N-j+1);
	            }
	            for (int j = N; j >0; j--) {
	                if (i+1 <= j) System.out.print("*");
	                else System.out.print(j);
	            }
	            System.out.println();
	        }

	}

}
