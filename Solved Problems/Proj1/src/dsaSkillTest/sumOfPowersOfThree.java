package dsaSkillTest;

public class sumOfPowersOfThree {
static public boolean checkPowersOfThree(int n) {
        
        while (n > 0) {
            if (n % 3 > 1) {
                return false;
            }
            n /= 3;
        }
        return true; 
}

	public static void main(String[] args) {
		 int n = 21;
		 
		 checkPowersOfThree(n);

	}

}
