public class MaximumSubarray {
    public static void main(String[] args) {
        int [ ] nums  = {-2, 1, -3, 4, -1, 2, 1, -5, 4} ;
        int res  = maxSubArray(nums) ; 
        System.out.println(res); 
    }
    public static  int maxSubArray(int[] nums) {
        int max_current = nums[0] ;
        int max_global = nums[0] ; 
        for(int i  = 1 ;  i< nums.length ; i++) {
            max_current = Math.max(max_current,  max_current + nums[i]);
            max_global = Math.max(max_global,max_current);
        }
        return max_global;

    }
    
}
