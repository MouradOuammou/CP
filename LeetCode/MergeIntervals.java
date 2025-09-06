
import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int [] [] intervals  = { 
   {1, 3},
    {2, 6},
    {8, 10},
    {15, 18}} ;
    int [] firstInterval = intervals[0];System.out.println(Arrays.toString(firstInterval));


        //    int [][] tab = merge(intervals) ; 
          //  System.out.println(Arrays.deepToString(tab));  
    }
    public static int[][] merge(int[][] intervals) {
                        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

          int  [] currentInterval  = intervals[0] ; 
        int n = intervals.length ; 
        List<int []> res = new ArrayList<>() ; 

        res.add(currentInterval) ; 
        for(int i = 1  ;i <n ; i++) {
                int [] nextInterval = intervals[i] ; 
                if(currentInterval[1] >= nextInterval[0])  currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);

                else{
                    currentInterval =  nextInterval ;
                    res.add(currentInterval) ; 
                } 
        }
        return res.toArray(new int[res.size()][]);
 }
}
