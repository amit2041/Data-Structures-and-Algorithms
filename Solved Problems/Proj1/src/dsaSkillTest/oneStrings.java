package dsaSkillTest;
import java.util.Scanner;
public class oneStrings {
	
	public static int sum(int n){
        return (n*(n+1))/2;
    }

    public static int findOneStrings(String str) {
        int count = 0,sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') count++;
            else {
                sum += sum(count);
                count = 0;
            }
        }
        sum += sum(count);
        return sum;
    }

	public static void main(String[] args) {
		

	}

}
