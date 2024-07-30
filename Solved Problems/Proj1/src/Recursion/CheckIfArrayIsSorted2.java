package Recursion;
import java.util.*;
import java.util.Scanner;
public class CheckIfArrayIcheck if it is sorted in ascending order or notsSorted2 {
	public static boolean isSortedBetter(int a[], int si) {
		if(si == a.length-1) {
			return true;
		}
		if(a[si]>a[si+1]) {
			return false;
		}
		boolean isSmallArraySorted = isSortedBetter(a, si+1);
			return isSmallArraySorted;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		

	}

}
