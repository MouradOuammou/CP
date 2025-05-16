import java.util.*;

public class MinimumIndexSumofTwo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};

        String[] result = findRestaurant(list1, list2);
        for (String restaurant : result) {
            System.out.println(restaurant);
        }
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> ans = new LinkedList<>();
        Map<String, Integer> restaurantToIndex = new HashMap<>();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; ++i)
            restaurantToIndex.put(list1[i], i);
        System.out.println(restaurantToIndex.toString());

        for (int i = 0; i < list2.length; ++i) {
             String restaurant = list2[i];
            if (restaurantToIndex.containsKey(restaurant)) {
                 int sum = restaurantToIndex.get(restaurant) + i;
                if (sum < minSum) {
                    minSum = sum;
                    ans.clear();
                    ans.add(restaurant);
                } else if (sum == minSum) {
                    ans.add(restaurant);
                }
            }
        }

        return ans.toArray(new String[0]);
    }
}
