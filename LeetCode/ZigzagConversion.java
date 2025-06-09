public class ZigzagConversion {
    public static void main(String[] args) {
        String result = convert("PAYPALISHIRING", 3);
        System.out.println(result); // Résultat attendu : PAHNAPLSIIGYIR
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        // On crée un tableau de StringBuilder pour chaque ligne
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++)
            rows[i] = new StringBuilder();  
        int currentRow = 0;
        boolean goingDown = false;

        // Pour chaque caractère, on l'ajoute à la bonne ligne
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Quand on atteint le haut ou le bas, on change de direction
            if (currentRow == 0 || currentRow == numRows - 1)
                goingDown = !goingDown;

            // On change de ligne selon la direction
            currentRow += goingDown ? 1 : -1;
        }

        // On combine toutes les lignes en une seule chaîne
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows)
            result.append(row);

        return result.toString();
    }
}
