import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sales {
    public static void main(String[] args) {
        List<Integer> ar = List.of(1,1,3,1,2, 1, 3, 3, 3,3);

        System.out.println(sockMerchant(9,ar));
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        int taille = ar.size();
        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < taille; i++) {
            int couleur = ar.get(i);
            if (res.containsKey(couleur)) {
                res.put(couleur, res.get(couleur) + 1);
            } else {
                res.put(couleur, 1);
            }
        }
          int cpt =  0 ;
        for ( Integer couleur : res.values() ) {
            cpt += couleur / 2;
        }
        return cpt;
    }
}