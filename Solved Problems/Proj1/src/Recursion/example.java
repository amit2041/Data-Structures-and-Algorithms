package Recursion;

public class example {
	public static int func(int num) {
		return func(num-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int ans = func(num-1);
		System.out.println(ans);

	}

}
