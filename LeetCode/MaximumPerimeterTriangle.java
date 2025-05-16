import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeterTriangle {
    public static void main(String[] args) {
        List<Integer> sticks = new ArrayList<>(List.of(1, 2, 3, 4));
        System.out.println(maximumPerimeterTriangle(sticks));
    }
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        Collections.sort(sticks);
        for (int i = sticks.size() - 1; i >= 2; i--) {
            int a = sticks.get(i - 2);
            int b = sticks.get(i - 1);
            int c = sticks.get(i);
            if (a + b > c) {
                return Arrays.asList(a, b, c);
            }
        }
        return Arrays.asList(-1);
    }
}

