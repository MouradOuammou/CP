

public class IntegertoRoman {
    public static void main(String[] args) {
        int num =58 ;
         System.out.println(intToRoman(num));
    }
       public static  String intToRoman(int num) {
         StringBuilder sb = new StringBuilder() ; 
        String[] Romans = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int [] values =    {1,   4,   5,  9,  10, 40  ,50, 90, 100, 400,500, 900,1000} ;

        for ( int i = values.length -1 ; i>=0  ; i--) {
                while ( num >= values[i]) {
                    num -= values[i];
                    sb.append(Romans[i]);
                }  
        }
         return  sb.toString() ; 
    }
    
}
