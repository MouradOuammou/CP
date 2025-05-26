
import java.util.HashMap;
import java.util.Map;

public   class  Single{
    public static void main(String[] args) {
        
    }
    public int singleNumber(int[] nums) { 
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (map.get(nums[i]) == 2)
                return nums[i];
        }
        return -1;
    }

}