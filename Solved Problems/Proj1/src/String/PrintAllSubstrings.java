package String;
import java.util.Scanner;
public class PrintAllSubstrings {
	
	public static void printSubstrings(String str) {
		//Your code goes here
		for(int i = 0; i < str.length();i++) {
			for(int j = i+1 ;j <= str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sr =  new Scanner(System.in);
		String str = sr.next();

		printSubstrings(str);

	}

}
