package hashMap;
import java.util.*;
public class PrintIntersection {
	
	public static void printIntersection(int[] arr1,int[] arr2){
		if(arr1.length==0 || arr2.length==0)
            return ;
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<arr1.length;i++){
            	if(map.containsKey(arr1[i])) {
            		int value = map.get(arr1[i]);
           //     map.put(arr1[i],map.get(arr1[i])+1);
            		map.put(arr1[i],value+1);
            	}else {
                 map.put(arr1[i],1);
            	}
            }
            
            for(int i=0;i<arr2.length;i++){
                if(map.containsKey(arr2[i])){
                	int freq = map.get(arr2[i]);
                    if(freq>0){
                    System.out.print(arr2[i]+" ");
                    map.put(arr2[i],freq-1);
                    }
                }
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 2, 3, 2, 2, 4, 8, 4, 3, 8, 9};
		int arr2[] = {1, 5, 4, 7, 6, 8};
		printIntersection(arr1,arr2);
	//		System.out.println(output1);

	}

}
