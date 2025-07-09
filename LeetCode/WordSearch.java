public class WordSearch {
    public static void main(String[] args) {
        WordSearch ws = new WordSearch();

        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };

        String word1 = "ABCCED";
        String word2 = "SEE";
        String word3 = "ABCB";

        System.out.println(ws.exist(board, word1)); 
        System.out.println(ws.exist(board, word2));
        System.out.println(ws.exist(board, word3)); 
    }

    private boolean[][] visited;  

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int columns = board[0].length;
        visited = new boolean[rows][columns]; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j] == word.charAt(0) && searchword(i, j, 0, word, board)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean searchword(int i, int j, int index, String word, char[][] board) {
        if (index == word.length()) return true;

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length
                || board[i][j] != word.charAt(index)
                || visited[i][j]) {
            return false;
        }
        visited[i][j] = true;
        boolean found = searchword(i + 1, j, index + 1, word, board)
                     || searchword(i - 1, j, index + 1, word, board)
                     || searchword(i, j + 1, index + 1, word, board)
                     || searchword(i, j - 1, index + 1, word, board);
        visited[i][j] = false;  
        return found;
    }

}
