public class EditDistance {
    public static void main(String[] args) {
        String word1 = "abcdef", word2 = "azcde";
        System.out.println("Mot 1: " + word1);
        System.out.println("Mot 2: " + word2);
        System.out.println("Distance minimale: " + minDistance(word1, word2));
    }

    public static int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] Matrix = new int[n + 1][m + 1];
        
        // Initialisation des bordures
        for (int i = 1; i <= n; i++) Matrix[i][0] = i;
        for (int j = 1; j <= m; j++) Matrix[0][j] = j;

        System.out.println("\n=== MATRICE INITIALE ===");
        printMatrix(Matrix, word1, word2, n, m);

        // Calcul de la matrice
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    Matrix[i][j] = Matrix[i - 1][j - 1];
                    System.out.printf("\nPosition [%d][%d]: Caractères identiques ('%c' = '%c')\n", 
                                    i, j, word1.charAt(i-1), word2.charAt(j-1));
                    System.out.printf("Valeur copiée depuis topLeft: %d\n", Matrix[i][j]);
                } else {
                    int topLeft = Matrix[i - 1][j - 1];
                    int top = Matrix[i - 1][j];
                    int left = Matrix[i][j - 1];
                    
                    System.out.printf("\nPosition [%d][%d]: Caractères différents ('%c' ≠ '%c')\n", 
                                    i, j, word1.charAt(i-1), word2.charAt(j-1));
                    System.out.printf("  TopLeft [%d][%d]: %d (substitution) - remplace '%c' par '%c'\n", 
                                    i-1, j-1, topLeft, word1.charAt(i-1), word2.charAt(j-1));
                    System.out.printf("  Top     [%d][%d]: %d (suppression) - supprime '%c' de word1\n", 
                                    i-1, j, top, word1.charAt(i-1));
                    System.out.printf("  Left    [%d][%d]: %d (insertion) - insère '%c' de word2\n", 
                                    i, j-1, left, word2.charAt(j-1));
                    
                    Matrix[i][j] = Math.min(topLeft, Math.min(top, left)) + 1;
                    System.out.printf("  Minimum: %d + 1 = %d\n", Math.min(topLeft, Math.min(top, left)), Matrix[i][j]);
                }
            }
        }

        System.out.println("\n=== MATRICE FINALE ===");
        printMatrix(Matrix, word1, word2, n, m);
        
        return Matrix[n][m];
    }

    private static void printMatrix(int[][] matrix, String word1, String word2, int n, int m) {
        // En-tête avec word1
        System.out.print("    ε  ");
        for (int j = 0; j < n; j++) {
            System.out.printf("%2c ", word1.charAt(j));
        }
        System.out.println();

        // Ligne de séparation
        System.out.print("   ");
        for (int j = 0; j <= n; j++) {
            System.out.print("---");
        }
        System.out.println();

        // Lignes de la matrice
        for (int i = 0; i <= m; i++) {
            // Étiquette de ligne (word2 ou ε)
            if (i == 0) {
                System.out.print("ε |");
            } else {
                System.out.printf("%c |", word2.charAt(i - 1));
            }

            // Valeurs de la matrice
            for (int j = 0; j <= n; j++) {
                System.out.printf("%2d ", matrix[j][i]);
            }
            System.out.println();
        }
        System.out.println();
    }
}