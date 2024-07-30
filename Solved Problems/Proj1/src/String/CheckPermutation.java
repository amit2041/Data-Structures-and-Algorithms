package String;
import java.util.Scanner;
public class CheckPermutation {
	
	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
		int[] arr = new int[500]; 

        for (int i = 0; i < str1.length(); i++) {
            arr[(int) str1.charAt(i)] += 1;
        }

        for (int i = 0; i < str2.length(); i++) {
            arr[(int) str2.charAt(i)] -= 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) return false;
        }

        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		String str1 = sr.nextLine();
		String str2 = sr.nextLine();
		boolean ans = isPermutation(str1, str2);

		System.out.println(ans);

	}

}
