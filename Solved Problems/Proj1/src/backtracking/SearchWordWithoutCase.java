package backtracking;

public class SearchWordWithoutCase {
	
	public static boolean present(char[][] board, String word, int n, int m) {
        // Checking for each cell on the 'board'.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            // If the first letter matches.
                if (board[i][j] == word.charAt(0)) {
                // Call search function to check if the word can be formed starting from the current cell.
                    if (search(i, j, n, m, board, word, 0))
                        return true;
                }
            }
        }
        // Word not found on the board.
        return false;
        }
        
    private static boolean search(int i, int j, int n, int m, char[][] board, String word, int k) {
        // Check if the word has been found.
        if (k == word.length())
            return true;
        // Check if the current position is out of bounds or the cell is visited or doesn't match the current letter.
        else if (i < 0 || i == n || j < 0 || j == m || board[i][j] == '#' || board[i][j] != word.charAt(k))
             return false;
        else {
        // Store the value of the current cell.
            char temp = board[i][j];
        // Mark the current cell as visited.
        board[i][j] = '#';
        // Recursively call search for the neighboring cells.
        boolean op1 = search(i + 1, j, n, m, board, word, k + 1);
        boolean op2 = search(i, j + 1, n, m, board, word, k + 1);
        boolean op3 = search(i - 1, j, n, m, board, word, k + 1);
        boolean op4 = search(i, j - 1, n, m, board, word, k + 1);
        // Restore the original value of the current cell.
        board[i][j] = temp;
        // Return true if any of the neighboring cells found the word.
        return op1 || op2 || op3 || op4;
        }
        }

	public static void main(String[] args) {
		char[][] board = {{'h', 'h', 'd', 'b', 'h'}, {'d', 'e', 'l', 'w', 'o'}, {'z', 's', 'l', 'o', 'm'}, {'j', 'i', 'g', 'n', 'k'}};
		String word = "hello";
		//String word = "road";
		System.out.println(present(board, word, 4, 5));

	}

}
