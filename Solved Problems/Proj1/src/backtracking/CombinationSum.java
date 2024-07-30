package backtracking;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class CombinationSum {
	public static List< List < Integer > > combSum(int []ARR, int B) {
        Arrays.sort(ARR);
       List < List < Integer >> result = new ArrayList < > ();
        List<Integer> currentList = new ArrayList<>();
        solve(result, 0, 0, currentList, B, ARR);
        return result;
    }
    public static void solve(List<List<Integer>> res, int currentIndex, int currentSum, List<Integer>currentList, int B, int[]ARR){
        if(currentSum == B){
            res.add(new ArrayList<>(currentList));
            return;
        }
        if(currentIndex == ARR.length){
            return;
        }
        solve(res, currentIndex+1, currentSum, currentList,B, ARR);
        int count = 0;
        while(currentSum<=B){
            count++;
            currentSum+= ARR[currentIndex];
            currentList.add(ARR[currentIndex]);
            solve(res, currentIndex+1, currentSum, currentList, B, ARR);

        }
        //we remove ARR[currentIndex] from currentList 'count' number of times for backtracking
        while(count-- > 0){
            currentList.remove(currentList.size()-1);
        }
    }
	public static void main(String[] args) {
		

	}

}
