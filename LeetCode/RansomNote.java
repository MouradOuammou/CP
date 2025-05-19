import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        String a = "aabsyh";
        String b = "aabssykhsh";
        System.out.println(canConstruct(a,b));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> res = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            res.put(c, res.getOrDefault(c, 0) + 1);
        }
                System.out.println(res.toString());

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            System.out.println(c);
            if (!res.containsKey(c) || res.get(c) == 0) {
                return false; 
            }
            res.put(c, res.get(c) - 1);  
        }
                System.out.println(res.toString());


        return true;
    }
}
