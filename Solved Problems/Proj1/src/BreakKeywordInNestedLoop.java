
public class BreakKeywordInNestedLoop {

	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=n; j++) {
				if(i==j) {
					break;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("Outside While");

	}

}
