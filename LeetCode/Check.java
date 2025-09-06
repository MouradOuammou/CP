
import java.util.ArrayList;
import java.util.List;

public class Check {
    public static void main(String[] args) {
            System.out.println(checkDivisibility(8));
    }
     public static  boolean checkDivisibility(int n) {   
        int n1 = n ; 
            List<Integer> digits = new ArrayList<>();
            while(n1>0) {
                int digit = n1 %10 ; 
                digits.add(0,digit);
                n1/=10;
            }
            int x = 0 ; 
            int y = 1;
    for(Integer digit : digits) {x+= digit;y*=digit;}
    System.out.println(x); System.out.println(y);
    return n % (x + y) == 0;

}

    
}
