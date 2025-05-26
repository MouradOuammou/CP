

public class RemoveDeplicate {
    public static void main(String[] args) {
    int tab [] = {2,2,2,6,4,8,7,1,1,2,3};
      System.out.println(removeDuplicates(tab));  
    }
        public static int removeDuplicates(int[] nums) {
    int n = nums.length;
    int count = 0 ;
    
    for (int i = 0; i < n - 1; i++) { 
        if (nums[i] != nums[i + 1]) {
            count++;
            nums[count] = nums[i + 1]; 
        }
    }
    System.out.println(nums.length);
    
    return count + 1;
}
    
}
