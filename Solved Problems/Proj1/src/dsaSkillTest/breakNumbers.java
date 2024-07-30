package dsaSkillTest;

import java.util.Scanner;

public class breakNumbers {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
	        printCombination(n);
	    }
		 private static void generatePartitions(int n, int start, String partitionSoFar) {
	        if (n == 0) {
	            System.out.println(partitionSoFar);
	            return;
	        }

	        for (int i = start; i <= n; i++) {
	            String newPartition = partitionSoFar.isEmpty() ? Integer.toString(i) : partitionSoFar + " " + i;
	            generatePartitions(n - i, i, newPartition);
	        }
	    }
	public static void printCombination(int num){
	
		 generatePartitions(num, 1, "");
	    }

}
