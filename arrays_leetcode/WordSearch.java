package arrays_leetcode;

//Given an m x n grid of characters board and a string word, return true if word exists in the grid.
//The word can be constructed from letters of sequentially adjacent cells, where
// adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
//Example 1:
//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
//Output: true

//-------------------------------------------------------------------------------------------------------------------
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j)) {
                    return true;
                }
            }
        }

        return false;
    }


    private boolean dfs(char[][] board, String word, int index, int i, int j) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length ||
                board[i][j] != word.charAt(index)) {
            return false;
        }


        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = dfs(board, word, index + 1, i - 1, j) || // up
                dfs(board, word, index + 1, i + 1, j) || // down
                dfs(board, word, index + 1, i, j - 1) || // left
                dfs(board, word, index + 1, i, j + 1);   // right


        board[i][j] = temp;

        return found;
    }
    public static void main(String[] args) {
        WordSearch solver = new WordSearch();
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "ABCCED";
        System.out.println(solver.exist(board, word));  // Output: true
    }
}
