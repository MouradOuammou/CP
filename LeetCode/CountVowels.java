import java.util.HashSet;
import java.util.Set;

public class CountVowels {
        public static void main(String[] args) {
                String mot1 = "unicornarihan";
                String mot2 = "cuaieuouac";
                System.out.println(countVowelSubstrings(mot1));
                System.out.println("#".repeat(3));
                System.out.println(countVowelSubstrings(mot2));

        }   
         public static  int countVowelSubstrings(String word) {
               int n = word.length();
                 int count = 0; 
        for (int i = 0; i < n; ++i) {
                Set<Character> t = new HashSet<>();
            for (int j = i; j < n; ++j) {
                char currentChar = word.charAt(j); 
                if (!isVowel(currentChar)) {
                    break;
                }
                t.add(currentChar);
                if (t.size() == 5) {
                    count++;
                }
            }
        }
        return count;
    }
    private static  boolean isVowel(char character) {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }
}
