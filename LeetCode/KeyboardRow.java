import java.util.*;

public class KeyboardRow {
    public static String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        int n = words.length;
        List<String> result = new ArrayList<>();
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            if (isInOneRow(lowerWord, row1) || isInOneRow(lowerWord, row2) || isInOneRow(lowerWord, row3)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    private static boolean isInOneRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    // Exemple d'utilisation
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = findWords(words);

        System.out.println(Arrays.toString(result));
    }
}
