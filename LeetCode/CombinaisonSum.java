import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinaisonSum {
    public static void main(String[] args) {
     //   int[] tab = {2, 3, 6, 7};
     //   int target = 7;
        int [] tab2 = {2,5,2,1,2};
        int target2 = 5 ; 
    //    List<List<Integer>> result = combinationSum(tab, target);
        List<List<Integer>> result2 = combinationSum2(tab2, target2);


        // Affichage du résultat
        /* for (List<Integer> combination : result) {
            System.out.println(combination);
        } */
        for(List<Integer> combinationSum2 : result2) {
            System.out.println(combinationSum2);
        }
    }

   /*  public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, current, res);
        return res;
    }

    public static void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> res) {
        boolean check = false ; 
        if (target == 0) {
            res.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) {
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            if(candidates[i] == candidates[i+1] && !check ){
                current.add(candidates[i]);
                check = true ; 
            backtrack(candidates, target - candidates[i], i, current, res);
            current.remove(current.size() - 1);
            }
            else {

            }
            
        }
    } */

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates); 
        backtrack2(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    public static void backtrack2(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(current)); 
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            if (candidates[i] > target) break;

            current.add(candidates[i]);
            backtrack2(candidates, target - candidates[i], i + 1, current, res); 
            current.remove(current.size() - 1); 
        }
    }

}
