public class PowerOfThree {
    public static void main(String[] args) {
        int n  = 80 ; 
        System.out.println(isPowerOfThree(n));
        printMaxPower(4);
    }
    public static  boolean isPowerOfThree(int n) {
         return n > 0 && 1162261467 % n == 0;

    } 

   public static void printMaxPower(int base) {
        int max = Integer.MAX_VALUE;
        int power = 1;

        while (power <= max / base) {
            power *= base;
        }

        System.out.println("La plus grande puissance de " + base + " dans int est: " + power);
    }
}