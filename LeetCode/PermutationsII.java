import java.util.ArrayList;
import java.util.List;

public class PermutationsII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2 };
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
            backtrack(resultList,new ArrayList<>(), nums , new boolean[nums.length]);
        return resultList;
    }

      private static void backtrack(List<List<Integer>> resultList , ArrayList <Integer>  templist , int [] nums , boolean[] used){
        if(templist.size() == nums.length && !resultList.contains(templist)){
            resultList.add(new ArrayList<>(templist));
            return ; 
        }
        for(int i = 0 ; i< nums.length ; i++ ){

            if(used[i]) continue;
            used[i] = true  ; 
            templist.add(nums[i]);
            backtrack(resultList, templist, nums, used);
            used[i] = false ;
            templist.remove(templist.size() -1) ; 
        }
    }
}
