import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {
        int [] res  =  {1,1,2,2,3,3};
        System.out.println(distributeCandies(res));
    }
       public static  int distributeCandies(int[] candyType) {
        Set<Integer> type = new HashSet<>();
        for(int num : candyType) {
            type.add(num);  
        }
        return Math.min(type.size(), candyType.length / 2);
    }
}
