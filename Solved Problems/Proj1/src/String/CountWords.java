package String;
import java.util.Scanner;
public class CountWords {
	public static int countWords(String str) {	
		//Your code goes here
		int count = 1;
		for (int i = 0; i <str.length() ; i++)
		{
			if ((str.charAt(i) == ' '))
			{
				count++;
 
			}
		}
		
return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sr= new Scanner(System.in);
		String str = sr.nextLine();
		if(str==null)
		{
			str="";
		}
		int count = CountWords.countWords(str);
		System.out.println(count);

	}

}
