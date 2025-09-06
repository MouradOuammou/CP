import java.util.*;

public class ConferenceSchedule {

    // Fonction li treturn maximum dyal présentations
    public static int maxPresentation(List<Integer> scheduleStart, List<Integer> scheduleEnd) {
        int n = scheduleStart.size();

        // 1. Créer liste dyal présentations (start, end)
        List<int[]> presentations = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            presentations.add(new int[]{scheduleStart.get(i), scheduleEnd.get(i)});
        }

        // 2. Sorti 3la 7ssab end time
        presentations.sort(Comparator.comparingInt(a -> a[1]));

        // 3. Compteur pour maximum presentations
        int count = 0;
        int lastEndTime = 0;

        for (int[] pres : presentations) {
            if (pres[0] >= lastEndTime) {
                count++;
                lastEndTime = pres[1];  // Update last end time
            }
        }

        return count;
    }

    // Test
    public static void main(String[] args) {
        List<Integer> start = Arrays.asList(1, 1, 2);
        List<Integer> end = Arrays.asList(3, 2, 4);

        int max = maxPresentation(start, end);
        System.out.println("Maximum presentations: " + max); // Output: 2
    }
}
