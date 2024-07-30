package hashMap;
import java.util.ArrayList;
import java.util.HashMap;
public class MaximumFrequencyNumber {
	public static int maxFrequencyNumber(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int j : arr) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
                continue;
            }
            map.put(j, map.get(j) + 1);
        }
        int max = arr[0];
        for (int i : arr) {
            if (map.get(i) > map.get(max)){
                max = i;
            }
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 2, 2, 4, 8, 4, 3, 8, 9};
	//	int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int output1 = maxFrequencyNumber(arr);
		
		System.out.println(output1);
	}

}
