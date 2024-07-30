import java.util.Scanner;

public class Find_x_ToThePower_n {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
	       int n = s.nextInt();
	       int x = s.nextInt();
	       int power = 1;
	       int i = 1;
	       while(i<=x){
	          power = power*n;
	          i = i+1; 
	       }
	        System.out.println(power);

	}

}
