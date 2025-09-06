import java.util.*;

public class CombinationSumII {
    public static void main(String[] args) {
        int  [] candidates  = {10,1,2,7,6,1,5} ; 
        List<List<Integer>>  res = combinationSum2(candidates,8) ;
        System.out.println(res);  
    }
    public static  List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>>  res = new  ArrayList<>();
             Arrays.sort(candidates); 
            backtrack2(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
   public static void backtrack2(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> res) {
         if (target == 0) {
            res.add(new ArrayList<>(current)); 
            return;
        }
        int n  = candidates.length;
        for(int i = start ;  i< n ; i++) {
        if(i > start && candidates[i] == candidates[i-1]) continue;   
        if (candidates[i] > target) break;
        current.add(candidates[i]);
        backtrack2(candidates, target - candidates[i], i + 1, current, res); 
        current.remove(current.size() - 1); 
        }
            
    }
    
}
