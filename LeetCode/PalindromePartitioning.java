import java.util.*;

public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, String s, List<String> current, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            String substring = s.substring(start, end + 1);

            if (isPalindrome(substring)) {
                current.add(substring);            
                backtrack(end + 1, s, current, result); 
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromePartitioning solution = new PalindromePartitioning();

        String s = "aab";
        List<List<String>> result = solution.partition(s);

        System.out.println("Toutes les partitions palindromiques de \"" + s + "\":");
        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }
}
