import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        int n = 3; // change ce nombre pour tester avec d'autres valeurs
        List<String> result = generateParentheses(n);
        System.out.println(result);
    }

    public static List<String> generateParentheses(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    private static void backtrack(List<String> res, String current, int open, int close, int max) {
        // Cas de base : si la chaîne est complète (2*n caractères)
        if (current.length() == max * 2) {
            res.add(current);
            return;
        }

        // Si on peut encore mettre '('
        if (open < max) {
            backtrack(res, current + "(", open + 1, close, max);
        }

        // Si on peut mettre ')' (il faut qu'il y ait plus de '(' que de ')')
        if (close < open) {
            backtrack(res, current + ")", open, close + 1, max);
        }
    }
}
