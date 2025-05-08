import java.util.HashSet;
import java.util.Set;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babadredtgsd";
        System.out.println("Longest Palindromic Substrings:");
        longestPalindrome(s);
    }

    public static void longestPalindrome(String s) {
        Set<String> res = new HashSet<>();
        int taille = s.length();
        for (int i = 0; i < taille; i++) {
            expandAroundCenter(s, i, i, res);
            expandAroundCenter(s, i, i + 1, res);
        }

        System.out.println("Palindromes trouvés : " + res);
    }
    public static void expandAroundCenter(String s, int left, int right, Set<String> res) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            res.add(s.substring(left, right + 1));
            left--;
            right++;
        }
    }

}
