import java.util.*;

public class longest {
    public static void main(String[] args) {
        int  [] nums = {2,20,4,10,3,4,5} ; 
        int res  = longestConsecutive(nums);
        System.out.println(res);
    }
     public  static  int longestConsecutive(int[] nums) {
         Set<Integer  >  res = new HashSet<>(); 
        for(int num : nums) {
            res.add(num); 
        }
        int longest =  0 ;  
        for(int num : res) {
              int length  = 1 ;
            if(!res.contains(num-1)){
                 int currentNum = num;
                while(res.contains(currentNum+1)){
                    length ++ ; 
                    currentNum ++ ; 
                }
            }
                longest = Math.max(longest, length);
        }
        return longest ; 
    }
}