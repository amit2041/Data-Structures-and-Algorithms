package dsaSkillTest;

import java.util.Scanner;

public class donuts {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int minWeight = 0;
            int n = scanner.nextInt();
            int addNum = n/4;
            int[] arr  = new int[n];
            for (int j=0;j<arr.length;j++){
                arr[j] = scanner.nextInt();
            }
            for (int k =0;k<arr.length;k++){
                int min=arr[k];
                int pos = k;
                for (int j =k+1;j< arr.length;j++){
                    if (min>arr[j]){
                        min= arr[j];
                        pos = j;
                    }
                }
                if (min!=arr[k]){
                    int temp = arr[pos];
                    arr[pos] = arr[k];
                    arr[k] = temp;

                }
            }
            int k = arr.length-3;
            for (int j = 0; j < addNum; j++) {
                minWeight += arr[k];
                k-=3;
            }
            System.out.println(minWeight);
        }

	}

}
