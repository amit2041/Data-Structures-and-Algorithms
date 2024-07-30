import java.util.Scanner;
public class HalfDiamondPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("*");
		int j,k;
		for(int i =1;i<=n;i++) {
			System.out.print("*");
			
			for( j =1;j<=i;j++) {
				System.out.print(j);
				
			}
			k=i-1;
			while(i>=1&&k>0) {
				System.out.print(k);
				k--;
			}
			System.out.print("*");
			System.out.println();
		}
		//System.out.println();
		for(int i =n-1;i>=1;i--) {
			System.out.print("*");
			
			for( j =1;j<=i;j++) {
				System.out.print(j);
				
			}
			k=i-1;
			while(i>=1&&k>0) {
				System.out.print(k);
				k--;
			}
			System.out.print("*");
			System.out.println();
		}
		System.out.print("*");
    }
}
