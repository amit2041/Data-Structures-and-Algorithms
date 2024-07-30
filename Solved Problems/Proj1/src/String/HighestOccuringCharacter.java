package String;
import java.util.Scanner;
public class HighestOccuringCharacter {
	
	public static char highestOccuringChar(String str) {
		//Your code goes here
		int arr[]=new int[256];
		char ch=' ';
		
		for(int i=0;i<str.length();i++)
		{
			char  a=str.charAt(i);
		
		arr[a]++;
		
		if(arr[a]>=arr[ch])
		{
			ch=a;
		}
		}
	   return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		char ans = highestOccuringChar(str);
		System.out.println(ans);
	}

}
