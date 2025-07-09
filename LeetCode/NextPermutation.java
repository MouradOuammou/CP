import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 4, 2};
        int[] nums2 = {3, 2, 1};

        nextPermutation(nums1); // Affiche [1, 4, 2, 3, 5]
        nextPermutation(nums2); // Affiche [1, 2, 3]
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        System.out.println(i);
        if (i >= 0) {
            int j = n - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);

        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
