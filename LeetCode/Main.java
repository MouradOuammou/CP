import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Exemple de test
        List<Integer> s = List.of(1, 2, 1, 3, 2); // Liste de carrés de chocolat
        int d = 6; // Jour de naissance de Ron
        int m = 3; // Mois de naissance de Ron

        // Appeler la fonction birthday et afficher le résultat
        System.out.println(birthday(s, d, m)); // Devrait afficher 2

    }


    public static int birthday(List<Integer> s, int d, int m) {


        int taille = s.size();
        int count = 0;
        
        // Calculer la somme du premier segment
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += s.get(i); 

        }
        System.out.println("le nombre de m: " + m);
        System.out.println("le nombre de sum: " + sum);



        // Vérifier si le premier segment correspond au jour de naissance
        if (sum == d) {
            count++;
        }

        // Utiliser la fenêtre glissante pour vérifier les autres segments
        for (int i = m; i < taille; i++) {
            // Ajouter le nouvel élément à la somme
            sum += s.get(i);
            // Retirer l'élément à l'extérieur du segment
            sum -= s.get(i - m);
            
            // Vérifier si la somme correspond au jour de naissance
            if (sum == d) {
                count++;
            }
        }

        return count;  // Retourner le nombre de segments valides
    }
}


