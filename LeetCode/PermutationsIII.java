import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PermutationsIII {
    public static void main(String[] args) {
        
    }   
      public List<List<Integer>> permute(int[] nums) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        int rSize;
        result.add(new ArrayList<Integer>());

        for (int num : nums) {
            rSize = result.size();

            while (rSize > 0) {
                List<Integer> permution = result.pollFirst();
                for (int i = 0; i <= permution.size(); i++) {
                    List<Integer> newPermutation = new ArrayList<Integer>(permution);
                    newPermutation.add(i, num);
                    result.add(newPermutation);
                }
                rSize--;
            }
        }

        return result;
    }
}
