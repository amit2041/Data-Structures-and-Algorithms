package recursion3;
import java.util.Scanner;
public class ReturnSubsequenceOfString {
	
	public static String[] subsequence(String input){
		// Write your code here
		 if( input.isEmpty()){
            String[] output = new String[1];
            output[0] = "";
            return output;
        }
       String[] smallOutput = subsequence(input.substring(1));
       String[] output = new String[2*smallOutput.length];
       int i = 0;
       for(String s : smallOutput){
           output [i] = s;
           i++;
           output[i] = input.charAt(0)+s;
           i++;
       }
       return output;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	String[] output = subsequence("abc");
	//	for(String o : output) {
	//		System.out.println(o);
	//	}
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter a String");
		String input = s.nextLine();
		String output[] = subsequence(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
