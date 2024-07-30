package dynamicProgramming;
import java.util.* ;
import java.io.*; 
public class HouseRobber {
	
	public static long houseRobber(int[] valueInHouse) {
        
        if (valueInHouse.length == 0) {
            return 0;
        }

        if (valueInHouse.length == 1) {
            return valueInHouse[0];
        }

        return Math.max(houseRobberUtil(valueInHouse, 0, valueInHouse.length - 1),
                   houseRobberUtil(valueInHouse, 1, valueInHouse.length));
       }

    public static long houseRobberUtil(int[] valueInHouse, int start, int end) {
           
        long[] valueAtIthHouse = new long[valueInHouse.length];

        // Check if the thief may steal the first house or not.
        if (start == 0) {
            valueAtIthHouse[0] = valueInHouse[0];
            valueAtIthHouse[1] = Math.max(valueInHouse[0], valueInHouse[1]);
        } 
       
        else {
            valueAtIthHouse[0] = 0;
            valueAtIthHouse[1] = valueInHouse[1];
        }

        for (int i = 2; i < end; i++) {
            valueAtIthHouse[i] = Math.max(valueAtIthHouse[i - 2] + valueInHouse[i], valueAtIthHouse[i - 1]);
        }
           
        return valueAtIthHouse[end - 1];
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			int n = s.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++){
				arr[i] = s.nextInt();
			}
			System.out.println(houseRobber(arr));
		}
		s.close();

	}

}
