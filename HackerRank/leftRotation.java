import java.util.ArrayList;
import java.util.List;

public class leftRotation {
     public static void main(String[] args) {
        List<Integer> res = List.of(1,2,3,4,5,6,7);
        System.out.println(rotateLeft(3, res));
     }    
public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int n = arr.size();
        List<Integer> result = new ArrayList<>();

        for (int i = d; i < n; i++) {
            result.add(arr.get(i));
        }
        System.out.println(result);
        for (int i = 0; i < d; i++) {
            result.add(arr.get(i));
        }

        return result; 
    }
}    
