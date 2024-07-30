import java.util.Scanner;
public class OddSquarePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		
		while(i<=n) 
		{
			int j = i - 1; 
			while(j<n) 
			{
				System.out.print(j * 2 + 1);
				j++;
			}
			int k = 0;
			while(k < i - 1) 
			{
				System.out.print(k * 2 + 1);
				k++;
			}
			System.out.println();
			i++;
		}
	}
}

