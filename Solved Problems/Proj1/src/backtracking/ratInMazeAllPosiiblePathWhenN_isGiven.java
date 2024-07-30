package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


				////// this is coding ninjas assignment question


public class ratInMazeAllPosiiblePathWhenN_isGiven { // jab n ki value pahle se di hui hai like int maze[20[20]; tab code ko aise likhna hai	
	static void ratInAMaze(int maze[][], int n) {
	int path[][] = new int[n][n];
		solveMaze(maze,n,0,0,path);
		
	}
    
    public static void solveMaze(int[][] maze,int n, int i, int j, int[][] path)
	{
	
		
		if (i<0 || j<0 || i>=n || j>=n)
			return;

		if (path[i][j]==1)
			return;
		
	
		if (maze[i][j]==0)
			return;
		
		path[i][j]=1;
		 
		if (i==n-1 && j==n-1)
		{
			for (int row=0;row<n;row++)
			{
				for (int col=0;col<n;col++)
                {
                    System.out.print(path[row][col]+" ");
                }					
				
			}
			path[i][j]=0;
            System.out.println();
			return;
		}
	
		solveMaze(maze,n,i-1,j,path);
		solveMaze(maze,n,i,j+1,path);
		solveMaze(maze,n,i+1,j,path);
		solveMaze(maze,n,i,j-1,path);
		path[i][j]=0;
		
		return;
	}

	public static void main(String[] args)throws NumberFormatException, IOException{
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine().trim());
		int[][] maze = new int[20][20];
        for (int i = 0; i < n; i++)
        {
            StringTokenizer tk = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++)
            {
                maze[i][j] = Integer.parseInt(tk.nextToken());
            }
        }
        ratInAMaze(maze, n);

	}

}
