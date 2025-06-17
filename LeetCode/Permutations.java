import java.util.ArrayList;
import java.util.List;

public class Permutations {
    
    public static void main(String[] args) {
        
    }
    public static  List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList  = new ArrayList<>();
        backtrack(resultList,new ArrayList<>(), nums);
        return resultList  ;
    }
    private static void backtrack(List<List<Integer>> resultList , ArrayList <Integer>  templist , int [] nums){
        if(templist.size() == nums.length){
            resultList.add(new ArrayList<>(templist));
            return ; 
        }
        for(Integer num : nums ){
            if(templist.contains(num))
                  continue;
            templist.add(num);  

            backtrack(resultList, templist, nums);

            templist.remove(templist.size() -1) ; 
        }
    }
}
