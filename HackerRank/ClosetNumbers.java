import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosetNumbers {
    public static void main(String[] args) {
        List<Integer> res = Arrays.asList(1, 3, 5, 8, 10);
        System.out.println(closestNumbers(res));
    }

    public static List<Integer> closestNumbers(List<Integer> arr) {
           List<Integer> list  = new ArrayList<>();
            int n = arr.size() ; 
            Collections.sort(list);
            int mindiff = Integer.MAX_VALUE ; 
            for(int i =0  ; i< n - 1 ;  i ++) {
                int diff   = Math.abs(arr.get(i) - arr.get(i+1)) ; 
                if(mindiff > diff) 
                    mindiff = diff ;
                 
            }
            for(int i  = 0  ; i <n -1 ; i++) {
                if( mindiff == Math.abs(arr.get(i) - arr.get(i+1)) ) {
                    list.add(arr.get(i));
                    list.add(arr.get(i+1));
                }
            }
            System.out.println(mindiff);
            return list ;   
    }   
}
