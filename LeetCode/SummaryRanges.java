import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
         int [] nums = {0,1,2,3,4,5,7};
         List<String> res = summaryRanges(nums);
         System.out.println(res);
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;
        if (n == 0) return result;
        int start = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                start = nums[i];
            }
        }
        if (start == nums[n - 1]) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[n - 1]);
        }
        return result;
    }

}