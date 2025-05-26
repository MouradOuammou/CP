class Reverse {
    public static void main(String[] args) {
        int x = 1534 ; 
        System.out.println(reverse(x));
     

        
    }
   public static int reverse(int x) {
    int sign = (x < 0) ? -1 : 1;       
    int absX = Math.abs(x);             // Valeur absolue de x
    int reponse = 0;

    while (absX > 0) {
        int lastDigit = absX % 10;

        if (reponse > (Integer.MAX_VALUE - lastDigit) / 10) {
            return 0; 
        }

        reponse = reponse * 10 + lastDigit;
        absX /= 10;
    }

    reponse = reponse * sign;  

    return reponse;
}

}