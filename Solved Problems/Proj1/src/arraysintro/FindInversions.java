package arraysintro;
import java.util.Scanner;
public class FindInversions {
	static int findInversionCount(int arr[], int n) {
	int invCount = 0;
    for (int ii = 0; ii < n - 1; ii++)
      for (int jj = ii + 1; jj < n; jj++)
        if (arr[ii] > arr[jj]) {
          invCount++;
          
          System.out.print("{" + arr[ii] + "," + arr[jj] + "}, ");
        }
    return invCount;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
