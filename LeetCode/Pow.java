public class Pow {
    public static void main(String[] args) {
      //  double res = myPow(2.00000, 10); 
        double res1 = myPow(2.00000,-2);
     //   System.out.println("res :"+ res);
        System.out.println("res1 :"+ res1);

    }
  
public static double myPow(double x, int n) {
    long N = n;
    if (N < 0) {
        x = 1 / x;
        N = -N;
    }
    double res = 1.0;
    double current = x;
    while (N > 0) {
        if (N % 2 == 1) {
            res *= current;
        }
        current *= current;
        N = N / 2;
    }

    return res;
}

}