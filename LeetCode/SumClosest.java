import java.util.Arrays;

public class SumClosest {
    public static void main(String[] args) {
        int[] nums = {-4, 1, -1, 2};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];  
        int minDiff = Math.abs(closestSum - target);
        for(int i = 0; i < nums.length - 2; i++) {
            int left  = i + 1; 
            int right = nums.length - 1; 

            while (right > left) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return sum;
                }

                int diff = Math.abs(sum - target);
                if (diff < minDiff) {
                    minDiff = diff;
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }
}
