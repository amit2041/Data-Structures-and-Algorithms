package Recursion;

public class SumOfFirst_n_NaturalNumbers {
	public static int sumn(int n) {
		if(n==0) {
			return 0;
		}
			int smalloutput = sumn(n-1);
			int output = n + smalloutput;
			return output;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumn(10));

	}

}
