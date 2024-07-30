package String;

import java.util.Scanner;

public class ReverseWordWise {
	public static String reverseStringWordWise(String str) {
		//Your code goes here
		int end = str.length() - 1,start,j;
		String ans ="",word = "";
		for(int i= str.length() - 1;i >= 0;i--) {
			if(str.charAt(i) == ' ') {
				start = i + 1;
				word = "";
				for(j = start;j <= end;j++) {
					word += str.charAt(j);
				}
				end  = i - 1;
				ans = ans + word + " ";
			}
		}
		word = "";
		for(j = 0;j <= end;j++) {
			word = word + str.charAt(j);
		}
		ans += word;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		String ans = reverseStringWordWise(str);
		System.out.println(ans);
	}

}