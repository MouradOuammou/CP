import java.util.*;

public class PascaleII {

    public static void main(String[] args) {
        
    }
    public List<Integer> getRow(int rowIndex) {
              List<Integer> row = new ArrayList<>();
              long value = 1 ; 
              row.add((int)value);
               for (int k = 0; k <= rowIndex; k++){
                value = value  * (rowIndex - k + 1) / k ; 
                row.add((int)value);

               }     
              return  row ; 
    }
    
}
