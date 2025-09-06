
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

class WordPattern {
     public static void main(String[] args) {
        String a = "abba" ,  t = "dog dog dog dog" ; // true
        System.out.println("########".repeat(3));
        System.out.println(wordPattern(a, t));

        
     }
   public static boolean wordPattern(String pattern, String s) {
    String[] words = s.split(" ");
    if (pattern.length() != words.length) return false;

    Map<Character, String> map = new HashMap<>();
    Set<String> usedWords = new HashSet<>();

    for (int i = 0; i < pattern.length(); i++) {
        char c = pattern.charAt(i);
        String word = words[i];

        if (map.containsKey(c)) {
            if (!map.get(c).equals(word)) {
                return false;
            }
        } else {
            if (usedWords.contains(word)) {
                return false;
            }
            map.put(c, word);
            usedWords.add(word);
        }
    }

    return true;
}

}