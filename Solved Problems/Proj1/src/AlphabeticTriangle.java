import java.util.Scanner;
public class AlphabeticTriangle {

	public static void main(String[] args) {
		 Scanner s = new Scanner (System.in);
		 int n= s.nextInt();
		 int i = 1;
		 while(i<=n){
			 int j = 1;
			 while(j<=i){
				 char jthChar = (char)('A'+j-1);
				 System.out.print(jthChar);
				 System.out.print(" ");
				 j = j+1;
			 }
			 System.out.println();
			 i = i+1;
		 }

	}

}
