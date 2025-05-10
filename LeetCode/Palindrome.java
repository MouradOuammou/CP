public class Palindrome {
    public static void main(String[] args) {
        //Exemple Test
            int a  = 12345 , b  =123658 ,  c = 123321 , d = 151 ;
        System.out.println("Res des resulta suivant a est : "+isPalindrome(a));
        System.out.println("Res des resulta b est : "+isPalindrome(b));
        System.out.println("Res des resulta c est : "+isPalindrome(c));
        System.out.println("Res des resulta d est : "+isPalindrome(d));

    }
    public static boolean isPalindrome(int x) {
        if(x< 0)
            return false ;
        int  inputValue = x ;
        int res = 0 ;
        while( inputValue != 0) {
            int lastDigit =inputValue % 10;
            res = res*10 + lastDigit ;
            inputValue/=10;
        }
        return (x==res);
    }
}
