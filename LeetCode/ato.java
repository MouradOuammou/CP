public class ato {
    public static void main(String[] args) {
        String  str = "w123-wser";
        String  str1 = "81337c0d3";

        System.out.println(myAtoi(str1));
        System.out.println(myAtoi(str));

    }
  public static int myAtoi(String s) {
    s = s.trim();  // 1. Supprimer les espaces au début
    if (s.isEmpty()) return 0;  // Vérifier que la chaîne n'est pas vide

    int i = 0;
    int sign = 1;

    // 2. Gérer le signe
    if (s.charAt(i) == '+') {
        i++;
    } else if (s.charAt(i) == '-') {
        sign = -1;
        i++;
    }

    // 3. Lire les chiffres
    StringBuilder digits = new StringBuilder();
    while (i < s.length() && Character.isDigit(s.charAt(i))) {
        digits.append(s.charAt(i));
        i++;
    }

    // 4. Si aucun chiffre trouvé
    if (digits.length() == 0) return 0;

    // 5. Convertir en entier
    try {
        int result = Integer.parseInt(digits.toString());
        return result * sign;
    } catch (NumberFormatException e) {
        // 6. Gérer les cas hors limites (trop grand / petit)
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }
}

}