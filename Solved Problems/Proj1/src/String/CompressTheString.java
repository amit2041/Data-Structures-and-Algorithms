package String;
import java.util.Scanner;
public class CompressTheString {
	
	public static String getCompressedString(String str) {
		// Write your code here.
		int count=1;
		String str1="";
		int i=0;
		for(i=0;i<str.length()-1;i++)
		{

			if(str.charAt(i)==str.charAt(i+1))
			 count++;
			 else
			 {
				 if(count!=1)
			    str1=str1+str.charAt(i)+count;
				 else
					 str1=str1+str.charAt(i);
				 count=1;
			 }
		}
			 if(count!=1)
				 str1=str1+str.charAt(i)+count;
			 else
				 str1=str1+str.charAt(i);
			 return str1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		String ans = getCompressedString(str);
		System.out.println(ans);

	}

}
