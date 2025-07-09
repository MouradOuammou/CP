public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        if (divisor == 0) throw new ArithmeticException("Division by zero");
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;
        while (a >= b) {
            long temp = b;
            int multiple = 1;

            while (a >= (temp * 2)) { 
                temp = temp * 2;    
                multiple = multiple * 2; 
            }

            a -= temp;
            result += multiple;
        }

        boolean sameSign = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0);
        return sameSign ? result : -result;
    }

    public static void main(String[] args) {
        DivideTwoIntegers obj = new DivideTwoIntegers();
        System.out.println(obj.divide(42, 7)); // Affiche 6
    }
}