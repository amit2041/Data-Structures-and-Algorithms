package hashMap;

import java.util.HashMap;

public class DiferenceBetweenForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer> map = new HashMap<>();
		
		int arr[] = {12, 15, 18};
		
		//System.out.println(map);
		
		for(int i = 0; i<3; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
			for(int val : arr) {
				System.out.print(val+" ");
			}

	}

}
