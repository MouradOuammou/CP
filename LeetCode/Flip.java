
import java.util.Arrays;

public class Flip {
    public static void main(String[] args) {
             int[][] grid = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9,  10, 11, 12},
            {13, 14, 15, 16}
        };
        
        System.out.println(Arrays.deepToString(reverseSubmatrix(grid, 1, 0, 3)));
    }
      public static  int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
                for(int i = 0 ; i<k/2 ; i++) {  
                    for(int j = 0 ; j< k ;j++) {
                       int temp = grid[x+i][y+j];
                       grid[x+i][y+j] = grid[x+k-1-i][y+j];
                       grid[x+k-i-i][y+j] = temp ; 
                    }
                }
                
        
        return  grid ; 
        
    }       
 
}