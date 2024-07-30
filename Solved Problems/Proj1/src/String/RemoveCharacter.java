package String;
import java.util.Scanner;
public class RemoveCharacter {

	public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i = 0;i < rows;i++) {
			for(int j= 0;j < cols;j++) {
	             arr[i][j] = s.nextInt();			
			}
		}
		return arr;
	}
	
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String ans = "";
		for(int i= 0;i < str.length();i++) {
			if(str.charAt(i) == ch)
				continue;
			ans += str.charAt(i);
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		char x = sr.next().charAt(0);
		String ans = removeAllOccurrencesOfChar(str, x);
		System.out.println(ans);
	}

}
