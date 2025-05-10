import java.util.*;

public class MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> ar = List.of(1,1,2, 1, 2);
        System.out.println(migratoryBirds(ar));
    }
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int taille  = arr.size();
        for (int i = 0; i < taille; i++) {
            int x = arr.get(i);
            if(!map.containsKey(x)){
                map.put(arr.get(i), 1);
            }
            else{
                map.put(x, map.get(x) + 1);
            }
        }
        Optional<Map.Entry<Integer, Integer>> maxEntry = map.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue));
              return maxEntry.get().getKey();
    }

}
