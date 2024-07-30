package recursion3;

public class PrintKeypad {
	
	public static String getKeypadStr(int i){
		String[]a = {"", ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		return a[i];
	}
	public static void printKeypadHelper(int input, String strSoFar){
		if(input == 0){
			System.out.println(strSoFar);
			return;
		}
		int lastDigit = input%10;
		int remainingNumber = input/10;
		String options = getKeypadStr(lastDigit);

		for(int i = 0; i<options.length(); i++){
			printKeypadHelper(remainingNumber, options.charAt(i) + strSoFar);
		}
	}
	public static void printKeypad(int input){
		printKeypadHelper(input, "");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printKeypad(123);

	}

}
