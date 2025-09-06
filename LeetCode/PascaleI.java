

import java.util.ArrayList;
import java.util.List;

public class PascaleI {
    public static void main(String[] args) {
        
    }

     public static  List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            if(numRows == 0 ) return result ; 
            List<Integer> firstRow = new ArrayList<>(); 
            firstRow.add(1);
            result.add(firstRow);
            if(numRows == 1 ) return result ; 
            for(int i = 1 ; i< numRows;i++) {
                List<Integer> prevRow  = result.get(i-1);
                List<Integer> row = new ArrayList<>();
                row.add(1);
                for(int j = 0 ; j < i-1 ; j++) {
                    int val =  prevRow.get(j) + prevRow.get(j+1);
                    row.add(val);
                }
                row.add(1);
                result.add(row);

            }

           return  result ; 

}
}


