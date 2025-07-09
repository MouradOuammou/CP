import java.util.Arrays;

public class RemoveDu {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,2,2,2,2,3};
        int k = removeDuplicates(nums);
        System.out.println(k);
        System.out.println("Résultat : " + Arrays.toString(Arrays.copyOfRange(nums, 0, nums.length)));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int k = 2;  

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                System.out.println(Arrays.toString(nums));

                nums[k] = nums[i];
                k++;
            }
        }

        return k; 
    }
}
 