package graphs;
import java.util.Scanner;
public class AdjacencyMatrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // take number of vertices
		int e = s.nextInt(); // take number of edges
		int[][] adjMatrix = new int[n][n];
		for(int i = 0; i<e; i++) {
			int v1 = s.nextInt(); // row side value
			int v2 = s.nextInt(); // column side value
			adjMatrix[v1][v2] = 1; //when compare v1 side to v2 side
			adjMatrix[v2][v1] = 1; // when we compare v2 side to v1 side
		}
		for(int i = 0; i<n; i++) { // print graph
			for(int j = 0; j<n; j++) {
				System.out.print(adjMatrix[i][j]+" "); // print graphs value
			}
			System.out.println();
		}
	}

}
