import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Étape 2 : Inverser chaque ligne
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
            reverseRow(matrix[i]);  
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void reverseRow(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}

