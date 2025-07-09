
import java.util.Arrays;

public class StringMultiplier {
    public static String multiply(String num1, String num2) {
        // Cas particulier : si un des deux est "0", le résultat est "0"
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n = num1.length();
        int m = num2.length();

        int[] result = new int[n + m];
        System.out.println(Arrays.toString(result));
        for (int i = n - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';  

            for (int j = m - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int position = i + j + 1;

                int sum = digit1 * digit2 + result[position];

                result[position] = sum % 10;            
                result[position - 1] += sum / 10;  
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;

        // Ignorer les zéros en tête
        while (i < result.length && result[i] == 0) {
            i++;
        }
        while (i < result.length) {
            sb.append(result[i]);
            i++;
        }

        return sb.toString();
    }

    // Test
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";

        String produit = multiply(num1, num2);
        System.out.println(num1 + " × " + num2 + " = " + produit);  // Affiche : 123 × 456 = 56088
    }
}
