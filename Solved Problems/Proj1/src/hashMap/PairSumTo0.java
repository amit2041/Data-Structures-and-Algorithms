package hashMap;

import java.util.HashMap;

public class PairSumTo0 {
	
	public static int PairSum(int[] input, int size) {
		if (size==0)
            return 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key:input){	
            if(map.containsKey(key)){
            	map.put(key,map.get(key)+1);
        	}else{
                map.put(key,1);
            }   
        }
    int countPairs=0;
        for (Integer i: map.keySet()){
            if (map.containsKey(-i) && i!=0){
            	countPairs=countPairs+(map.get(i)*map.get(-i)); 
            }
        }
        countPairs=countPairs/2;
        if (map.containsKey(0)){
            int val=map.get(0);
            countPairs=countPairs+(val*(val-1))/2;
        }
        return countPairs;
       
       
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {-2, 2, 6, -2, -6, 3, 2};
		System.out.print(PairSum(arr, arr.length));
	}

}
