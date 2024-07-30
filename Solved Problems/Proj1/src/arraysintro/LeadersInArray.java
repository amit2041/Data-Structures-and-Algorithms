package arraysintro;
import java.util.Scanner;
public class LeadersInArray {
	public static void leaders(int[] input) {
		 int i;
	        int j;
	        
	        for(i=0;i<input.length-1;i++){
	            for(j=i+1;j<input.length;j++){
	                if(input[i]<input[j]){
	                    break;
	                    }
	            }
	            if(j==input.length){
	                System.out.print(input[i]+" ");
	            }
	          }
	        System.out.print(input[input.length-1]);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
                int[] input = new int[n];  

		for(int i=0; i<n; i++) {  
                //reading array elements from the user   
                 input[i]=s.nextInt();  
                }  
		LeadersInArray.leaders(input);

	}

}
