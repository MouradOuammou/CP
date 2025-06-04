import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
    public static void main(String[] args) {
        LetterCombinationsofaPhoneNumber obj = new LetterCombinationsofaPhoneNumber();
        List<String> result = obj.letterCombinations("23");
        System.out.println(result); // Exemple : [ad, ae, af, bd, be, bf, cd, ce, cf]
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.isEmpty()) return res;

        // Mapping de chiffres vers lettres
        String[] mapping = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        List<String> comb = new ArrayList<>();
        comb.add(""); 

        for (int i = 0; i < digits.length(); i++) {
            int index = digits.charAt(i) - '0'; 
            String letters = mapping[index];    

            List<String> temp = new ArrayList<>();

            for (String prefix : comb) {
                for (int j = 0; j < letters.length(); j++) {
                    temp.add(prefix + letters.charAt(j)); 
                }
            }

            comb = temp; 
        }

        return comb;
    }
}
