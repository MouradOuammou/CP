import java.util.ArrayList;
import java.util.List;

public class EncodeandDecode {
    public static void main(String[] args) {
               List<String> mots = List.of("neet", "code", "love", "you");
        System.out.println("##### ENCODE #####");
        String encoded = encode(mots);
        System.out.println(encoded);

        System.out.println("##### DECODE #####");
        List<String> decoded = decode(encoded);
        System.out.println(decoded);
    }
       public static String encode(List<String> strs) {
            StringBuilder sb = new StringBuilder();
            for (String s : strs) {
                sb.append(s.length()).append("#").append(s);
            }
            return sb.toString();
    }


    public static List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));
            j++; 
            String mot = s.substring(j, j + length);
            result.add(mot);
            i = j + length;
        }
        return result;
    }
}
