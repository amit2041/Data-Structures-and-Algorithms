import java.util.Scanner;
public class CalculateNcR {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		int factN = 1;
		for(int i = 1; i<=n; i++) {
			factN*=i;
		}
		int factR = 1;
		for(int i = 1; i<=r; i++) {
			factR*=i;
		}
		int factNR = 1;
		for(int i = 1; i<=n-r; i++) {
			factNR*=i;
		}
		int result = factN/(factR*factNR);
		System.out.println(result);

	}

}
