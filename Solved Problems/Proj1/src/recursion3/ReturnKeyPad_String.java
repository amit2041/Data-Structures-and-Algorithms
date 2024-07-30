package recursion3;
import java.util.Scanner;
public class ReturnKeyPad_String {
	
	public static String[] keypad(int n){
		// Write your code here
		if(n == 0){
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		String[] smallOutput = keypad(n/10);
		int lastDigit = n%10;
		

		String possibleChars = getKeyPadStr(lastDigit); // like- abc

		String[]output = new String[smallOutput.length * possibleChars.length()];
		int k = 0;

		for(String s : smallOutput){
			for(int i = 0; i<possibleChars.length(); i++){
				output [k] = s + possibleChars.charAt(i);
           k++;
			}
			}
			return output;
		}
		public static String getKeyPadStr(int i){
		String[]a = {"",".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		return a[i];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the keypad number");
		int input = s.nextInt();
		String output[] = keypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}

}
