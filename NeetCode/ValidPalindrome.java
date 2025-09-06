public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println("");
        String s = "Was it a car or a cat I saw?" ;
        System.out.println(isPalindrome(s)) ;
    }
    public static  boolean isPalindrome(String s) {
       int debut = 0  ; int fin = s.length() -1 ; 
       while(debut<fin){
        while(debut<fin && !alphaNum(s.charAt(debut))){debut++;}
        while(debut<fin && !alphaNum(s.charAt(fin))){fin--;}
        if(Character.toLowerCase(s.charAt(debut))!= Character.toLowerCase(s.charAt(fin))){
            return false;
        }
        debut ++ ; 
        fin -- ; 
       }
       return true ; 
    }
    public static boolean alphaNum(char c ) {
        return (c >= 'A' && c <= 'Z' || 
                c >= 'a' && c <= 'z' || 
                c >= '0' && c <= '9');
    }
}
