import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Try reading both strings (newline or space separated)
        String firstLine = reader.readLine();
        if (firstLine == null) {
            System.out.println("");
            return;
        }
        
        String[] inputs = firstLine.split(" ");
        String s, t;
        
        if (inputs.length >= 2) {
            // Space-separated case
            s = inputs[0].trim();
            t = inputs[1].trim();
        } else {
            // Newline-separated case
            s = firstLine.trim();
            String secondLine = reader.readLine();
            if (secondLine == null) {
                System.out.println("");
                return;
            }
            t = secondLine.trim();
        }
        
        // Validate and compute
        String result = strings_xor(s, t);
        System.out.print(result != null ? result : "");
        System.out.flush();
    }

    public static String strings_xor(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return null;
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if (c1 != '0' && c1 != '1') return null;
            if (c2 != '0' && c2 != '1') return null;
            
            result.append(c1 == c2 ? '0' : '1');
        }
        return result.toString();
    }
}