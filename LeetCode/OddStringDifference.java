import java.util.*;

public class OddStringDifference {
    public static void main(String[] args) {
        String[] words = {""};
        System.out.println(oddString(words)); 
    }

    public static String oddString(String[] words) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            // Créer la clé de différence pour le mot
            StringBuilder keyBuilder = new StringBuilder();
            for (int i = 0; i < word.length() - 1; i++) {
                int diff = word.charAt(i + 1) - word.charAt(i);
                keyBuilder.append(diff).append(",");
            }
            String key = keyBuilder.toString();

            // Ajouter le mot dans la map selon sa clé
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }
        System.out.println(map);
        // Trouver la liste qui contient seulement 1 mot (le différent)
        for (List<String> group : map.values()) {
            if (group.size() == 1) {
                return group.get(0); // Le mot différent
            }
        }

        return ""; // Par sécurité, mais selon l'énoncé il y a toujours une solution
    }
}
