public class SeparateNum {
    public static void main(String[] args) {
        String str1 = "101112";
         separateNumbers(str1);
    }
    public static void separateNumbers(String s) {
        if (s.length() == 1) {
            System.out.println("NO");
            return;
        }
        
        boolean beautiful = false;
        long firstNumber = -1;
        
        // Try different possible lengths for the first number
        for (int len = 1; len <= s.length() / 2; len++) {
            if (s.charAt(0) == '0') {
                break; // leading zero not allowed
            }
            
            String firstStr = s.substring(0, len);
            long num;
            try {
                num = Long.parseLong(firstStr);
            } catch (NumberFormatException e) {
                break;
            }
            
            StringBuilder sequence = new StringBuilder(firstStr);
            long next = num + 1;
            
            while (sequence.length() < s.length()) {
                sequence.append(next);
                next++;
            }
            
            if (sequence.toString().equals(s)) {
                beautiful = true;
                firstNumber = num;
                break;
            }
        }
        
        if (beautiful) {
            System.out.println("YES " + firstNumber);
        } else {
            System.out.println("NO");
        }
 }
    
}
