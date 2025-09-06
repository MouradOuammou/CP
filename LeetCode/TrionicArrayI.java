public class TrionicArrayI {
    public static void main(String[] args) {
        int [] nums = {1,3,5,4,2,6};
        isTrionic(nums);
    }   
    public static  boolean isTrionic(int[] nums) {
     int n = nums.length;
        if (n < 3) return false; 

        int i = 0;

        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == 0) return false;
        int p = i;
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }
        if (i == p) return false;
        int q = i;
        if (q == n - 1) return false;

        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        return i == n - 1;
    }

}
