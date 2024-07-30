import java.util.Scanner;
public class DiamondStarPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		 int n = s.nextInt();
       int i = 1;
       while (i <= n) {
          int spaces = 1;
           while (spaces <= n - i) {
               System.out.print(" ");
               spaces = spaces+1;
           }

          int stars = 1;
           while (stars<= i * 2 - 1) {
               System.out.print("*");
               stars = stars+1;
           }
           System.out.println();
           i = i+1;
       }
       i = n - 1;
       // Prints the second half diamond
       while (i > 0) {
         int spaces = 1;
           while (spaces <= n - i) {
               System.out.print(" ");
               spaces = spaces+1;
           }

           int stars = 1;
           while (stars <= i * 2 - 1) {
               System.out.print("*");
               stars = stars+1;
           }
           System.out.println();
           i = i-1;
       }

	}

}
