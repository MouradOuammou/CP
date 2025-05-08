import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;          // La longueur de la plus longue sous-chaîne
        int start = 0;        // Le début de la sous-chaîne actuelle
        Set<Character> set = new HashSet<>(); // Un Set pour vérifier les caractères répétés

        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(start));
                start++; 
            }
            set.add(s.charAt(i));

            max = Math.max(max, i - start + 1);
        }

        return max; 
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s1)); // Sortie: 3
        System.out.println(lengthOfLongestSubstring(s2)); // Sortie: 1
        System.out.println(lengthOfLongestSubstring(s3)); // Sortie: 3
    }
}
