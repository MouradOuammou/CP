import java.util.Arrays ; 
public class ReshapetheMatrix {
    public static void main( String [] args) {
            int [][] res  = {{1,2,6},{3,4,5}};
            System.out.println(Arrays.deepToString(matrixReshape(res, 1, 4)));

    }
public static  int[][] matrixReshape(int[][] mat, int r, int c) {
         int [][] result = new int[r][c] ;
        int row  =  mat.length ; 
        int col = mat[0].length;
        int index_row  = 0 ;
        int index_col = 0 ; 
        if(row * col == r * c){
            for(int i  = 0  ; i<row ;  i++) {
            for(int j  =0 ; j< col ; j++) {
                    result[index_row][index_col] = mat[i][j];
                    index_col++;
                    if(index_col == c ){
                        index_col = 0 ; 
                        index_row++ ; 
                    }
                }
             }
        }
        else return mat ; 
        return result ; 
    }
    
}