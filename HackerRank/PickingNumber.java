import java.util.Arrays;
import java.util.List;

public class PickingNumber {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 1, 2, 3, 4, 4, 6);
        System.out.println(pickingNumbers(a));  // Résultat attendu : 3 (par exemple [1,1,2] ou [4,4,3])
    }

    public static int pickingNumbers(List<Integer> a) {
        int[] count = new int[101];  

        for (int value : a) {
            count[value]++;
        }
        System.out.println(Arrays.toString(count));
        int res = 0;

        for (int i = 0; i < count.length - 1; i++) {
            int sum = count[i] + count[i + 1]; 
            if (sum > res) {
                res = sum; 
            }
        }

        return res;
    }
}
