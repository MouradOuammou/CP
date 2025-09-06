import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII {
    public static void main(String[] args) {
        int [] nums  = {
            1,2,2
        } ;
    }
    public static  List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>  resultaList = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(resultaList, new  ArrayList<>(),nums , 0) ; 
        return  resultaList; 
    }
      private static void backTrack(List<List<Integer>> result,  List<Integer> current, int[] nums, int start) {
        result.add(new ArrayList<>(current));
        
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i-1]) {
                continue; 
            }
            
            current.add(nums[i]);
            backTrack(result, current, nums, i + 1);
            current.remove(current.size() - 1);
        }
    }
    
}
