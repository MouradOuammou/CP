public class CountAndSay {
        public static void main(String[] args) {
               int n = 5;
        System.out.println("Le terme " + n + " de la suite Count and Say est : " + new CountAndSay().countAndSay(n));
        }
        public String countAndSay(int n) {
            String result = "1"; 
            for (int i = 2; i <= n; i++) {
            result = describe(result); 
            System.out.println(result);
        }

        return result;

    }
       private static String describe(String s) {
        StringBuilder sb = new StringBuilder();

        int count = 1;  // compteur de répétitions

        for (int i = 0; i < s.length(); i++) {
            // si le caractère suivant est le même, on augmente le compteur
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                // sinon, on écrit "compte + chiffre" dans la nouvelle chaîne
                sb.append(count);
                sb.append(s.charAt(i));
                count = 1;  // on réinitialise le compteur
            }
        }

        return sb.toString();
    }

}
