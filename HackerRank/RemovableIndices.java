import java.util.ArrayList;
import java.util.List;

public class RemovableIndices {
    public static void main(String[] args) {
        String str1  = "abdgggda", str2 = "abdggda"; 
        List<Integer> result = getRemovableIndices(str1, str2);
        System.out.println(result);
    }

    public static List<Integer> getRemovableIndices(String str1, String str2) {
        List<Integer> res = new ArrayList<>();

        // Vérifier la différence de longueur
        if (str1.length() != str2.length() + 1) {
            res.add(-1);
            return res;
        }

        // Tester chaque suppression
        for (int i = 0; i < str1.length(); i++) {
            String modified = str1.substring(0, i) + str1.substring(i + 1);
            if (modified.equals(str2)) {
                res.add(i);
            }
        }

        if (res.isEmpty()) {
            res.add(-1);
        }

        return res;
    }
}
