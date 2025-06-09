import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeSum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int right = nums.length - 1;
            int left = i + 1;
            while (right > left) {
                int a = nums[i];
                if (-a == nums[left] + nums[right]) {
                    res.add(new ArrayList<>(Arrays.asList(a, nums[left], nums[right])));
                }
                if (nums[left] == nums[left + 1] && nums[right] == nums[right - 1]) {
                    left += 2;
                    right -= 2;
                }
                left++;
                right -- ; 
            }

        }

        return res;
    }
}
