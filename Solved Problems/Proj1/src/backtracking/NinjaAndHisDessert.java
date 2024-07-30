package backtracking;
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class NinjaAndHisDessert {
	public static int close(int a, int b, int target){
		if(a==0){
			return b;
		}
		if(b==0){
			return a;
		}
		// both are equally closest return the lowest price
		if(Math.abs(target-a) == Math.abs(target-b)){
			return a<b ? a:b ;
		}
		return (Math.abs(target-a) < Math.abs(target-b) ? a:b);
	}
	//function to find closest price possible for a specific flavor
	public static int dfs(ArrayList<Integer> top, int i, int sum, int target){
		if(i>=top.size()){
			return sum;
		}
		// base+one topping
		int a = dfs(top, i+1, sum+top.get(i), target);
		// base + two topping
		int b = dfs(top, i+1, sum+top.get(i)*2, target);
		// only base
		int c = dfs(top, i+1, sum, target);
		//return the closest
		sum = close(a, close(b, c, target), target);
		return sum;
	}

	public static int closestCost(int n, int m, ArrayList<Integer> baseCosts, ArrayList<Integer> toppings, int target){
	    int ans = 0;
		for(int i = 0; i<n; i++){
			ans = close(dfs(toppings, 0, baseCosts.get(i), target), ans, target);
		}
		return ans;
	}

	public static void main(String[] args) {
		

	}

}
