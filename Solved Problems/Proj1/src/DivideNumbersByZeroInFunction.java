
public class DivideNumbersByZeroInFunction {
	public static int devideNumber(int num, int deno) {
		if(deno==0) {
			return Integer.MIN_VALUE;
		}
		//System.out.println("Inside Division Function");
		return num/deno;
	}

	public static void main(String[] args) {
		int num = 8;
		int deno = 0;
		int result = devideNumber(num, deno);
		System.out.println(result);

	}

}
