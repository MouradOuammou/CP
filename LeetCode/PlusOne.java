import java.util.Arrays;

class One {
    public static void main(String[] args) {
        int [] tab = { 8,9,9};
                int [] tab1 = { 1,2,3};
                int[] result1 = plusOne(tab1);

        int[] result = plusOne(tab);
        System.out.println(Arrays.toString(result));
                System.out.println(Arrays.toString(result1));

    }
     public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // Ajouter 1 au dernier chiffre
            if (digits[i] < 9) {
                digits[i]++;
                return digits;  // Pas de report, on retourne directement
            }
            // Si chiffre == 9, on met 0 et continue la boucle pour reporter 1 à gauche
            digits[i] = 0;
        }
        // Si on arrive ici, c’est que tous les chiffres étaient 9
        // On crée un nouveau tableau avec 1 en premier chiffre et le reste à 0
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}