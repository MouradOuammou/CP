
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        

    }
    public static int[] twoSum(int[] nums, int target) {
        int taille = nums.length;
        int complement ;
        Map<Integer , Integer> res = new HashMap<>();
        for(int i = 0 ; i< taille ; i++){
             complement = target - nums[i];
             if(res.containsKey(complement))
                return new int[] {
                    res.get(complement), i
                };
             res.put(nums[i], i);
            }
            return new int[0]; 
        }
    }
    