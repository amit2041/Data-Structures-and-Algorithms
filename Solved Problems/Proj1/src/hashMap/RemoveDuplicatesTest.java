package hashMap;
import java.util.*;
public class RemoveDuplicatesTest {
	
	public static ArrayList<Integer> removeDuplicates(int []arr){
		ArrayList<Integer>output = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int i = 0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}
			output.add(arr[i]);
			map.put(arr[i], true);
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 2, 3, 5, 8, 5, 1, 9, 8, 9};
		ArrayList<Integer> output1 = removeDuplicates(arr);
		System.out.println(output1);
	}

}
