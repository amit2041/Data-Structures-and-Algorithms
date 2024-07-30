package backtracking;
public class SearchWord {
	
	public static boolean present(char[][]board, String word, int n, int m) {
        int [][]visited = new int [n][m];
        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(board[i][j] == word.charAt(0)){
                    if(search(board, word, visited, 1, i, j, n, m)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean search(char[][]board, String word, int visited[][], int currentIndex, int i , int j, int n, int m){
        if(currentIndex == word.length()){
            return true;
        }
        visited[i][j] = 1;

        //right = i, j+1
         if(j+1<m && visited[i][j+1] == 0 && board[i][j+1] == word.charAt(currentIndex)){
            //then we can search this direction
            if(search(board, word, visited, currentIndex+1, i, j+1, n, m)){
                return true;
            }
        }

        //left= i, j-1
         if(j-1>=0 && visited[i][j-1] == 0 && board[i][j-1] == word.charAt(currentIndex)){
            //then we can search this direction
            if(search(board, word, visited, currentIndex+1, i, j-1, n, m)){
                return true;
            }
        }

        //top = i-1, j
         if(i-1>=0 && visited[i-1][j] == 0 && board[i-1][j] == word.charAt(currentIndex)){
            //then we can search this direction
            if(search(board, word, visited, currentIndex+1, i-1, j, n, m)){
                return true;
            }
        }

        //down = i+1, j
         if(i+1<n && visited[i+1][j] == 0 && board[i+1][j] == word.charAt(currentIndex)){
            //then we can search this direction
            if(search(board, word, visited, currentIndex+1, i+1, j, n, m)){
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		char[][] board = {{'h', 'h', 'd', 'b', 'h'}, {'d', 'e', 'l', 'w', 'o'}, {'z', 's', 'l', 'o', 'm'}, {'j', 'i', 'g', 'n', 'k'}};
		String word = "hello";
		//String word = "road";
		System.out.println(present(board, word, 4, 5));

	}

}
