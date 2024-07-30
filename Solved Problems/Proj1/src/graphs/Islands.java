package graphs;
import java.util.Scanner;
import java.io.IOException;
public class Islands {
	public static int numConnected(int[][] edges, int n) {
        
		 boolean[] visited=new boolean[n];
       int count = 0;
       for(int i=0; i<n; i++){
           if(visited[i] == false){
               dfs(edges, i, visited, n);
               count++;
           }
       }
       return count;
	}
	
	 static Scanner sc = new Scanner(System.in);

	    public static int[][] takeInput() throws IOException {
			String[] strNums;
	        strNums = sc.nextLine().split("\\s");
	        int n = Integer.parseInt(strNums[0]);
	        int e = Integer.parseInt(strNums[1]);

	        int[][] edges = new int[n][n];
	        int firstvertex, secondvertex;

	        for (int i = 0; i < e; i++) {
	            String[] strNums1;
	            strNums1 = sc.nextLine().split("\\s");
	            firstvertex = Integer.parseInt(strNums1[0]);
	            secondvertex = Integer.parseInt(strNums1[1]);
	            edges[firstvertex][secondvertex] = 1;
	            edges[secondvertex][firstvertex] = 1;
	        }
	        return edges;
	    }
   private static void dfs(int[][]edges, int v1, boolean[] visited, int n){
       visited[v1]=true;
       
       for(int i=0; i<n; i++){
           if(visited[i] == false && edges[v1][i] == 1){
               dfs(edges, i, visited, n);
           }
       }
	}

	public static void main(String[] args) throws IOException {
		  int [][]edges = takeInput();
	        
	        int ans = numConnected(edges, edges.length);
	        System.out.println(ans);

	}

}
