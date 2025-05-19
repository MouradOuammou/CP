
import java.util.TreeSet;

public class RemoveDeplicate {
   public static int removeDuplicates(int[] nums) {
    int n = nums.length;
    int count = 0 ;
    
    for (int i = 0; i < n - 1; i++) { 
        if (nums[i] != nums[i + 1]) {
            count++;
            nums[count] = nums[i + 1]; 
        }
    }
    
    return count + 1;
}

    
}
