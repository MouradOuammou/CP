import java.util.HashSet;

public class Sudoku {

    public static void main(String[] args) {
        char[][] Grille = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(Grille)); // Doit afficher true
    }

    public static boolean isValidSudoku(char[][] board) {
        return CheckColonne(board) && CheckLigne(board) && CheckDo(board);
    }

    public static boolean CheckColonne(char[][] board) {
        for (int col = 0; col < 9; col++) {
            HashSet<Character> seen = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                char value = board[row][col];
                if (value != '.') {
                    if (seen.contains(value)) return false;
                    seen.add(value);
                }
            }
        }
        return true;
    }

    public static boolean CheckLigne(char[][] board) {
        for (int row = 0; row < 9; row++) {
            HashSet<Character> seen = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                char value = board[row][col];
                if (value != '.') {
                    if (seen.contains(value)) return false;
                    seen.add(value);
                }
            }
        }
        return true;
    }

    public static boolean CheckDo(char[][] board) {
        for (int startRow = 0; startRow < 9; startRow += 3) {
            for (int startCol = 0; startCol < 9; startCol += 3) {
                HashSet<Character> seen = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char value = board[startRow + i][startCol + j];
                        if (value != '.') {
                            if (seen.contains(value)) return false;
                            seen.add(value);
                        }
                    }
                }
            }
        }
        return true;
    }
}
