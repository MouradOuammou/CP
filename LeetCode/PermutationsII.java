import java.util.ArrayList;
import java.util.List;

public class PermutationsII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        f(nums, result, 0);
        return result;
    }

    public static void f(int[] nums, List<List<Integer>> result, int index) {
        if (index == nums.length) {
            List<Integer> perms = new ArrayList<>();
            for (int el : nums) {
                perms.add(el); // ✅ on ajoute chaque élément de nums dans une seule liste
            }
            result.add(perms); // ✅ on ajoute cette liste au résultat
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index); // place chaque élément à la position "index"
            f(nums, result, index + 1); // appelle récursivement avec l'index suivant
            swap(nums, i, index); // annule le swap (backtracking)
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
