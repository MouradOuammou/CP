public class JumpGame {
    public static void main(String[] args) {
        int []nums  = {2,3,1,1,4};
        int  []nums1  = {3,2,1,0,4};
        boolean res   = canJump(nums);
        boolean res1   = canJump(nums1);
        System.out.println(res);
        System.out.println(res1);
        
    }
    public static  boolean canJump(int[] nums) { 
            int n = nums.length-1;
            int goal = nums.length - 1 ;
            for(int i  = n  ; i>= 0 ; i--) {
                if(i+ nums[i] >= goal)
                        goal = i ; 
            }
            return goal == 0 ;
    }
}