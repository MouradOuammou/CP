import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionfTooArraysII {
    public static void main(String[] args) {
         int[] nums1 = {1,2,3,2,1,5,8};
        int[] nums2 = {2,2,2,2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2))); // [2, 2]
    }
     public static  int[] intersect(int[] nums1, int[] nums2) {
        // 1. نخلي nums1 أصغر من nums2 (باش نستهلك ميموار أقل)
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        // 2. نحسب التكرار ديال العناصر فـ nums1
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums1) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }
        System.out.println(countMap);
        // 3. ندور على nums2 ونشوف وا,ش العنصر كاين فالماب
        List<Integer> result = new ArrayList<>();
        for (int n : nums2) {
            if (countMap.containsKey(n) && countMap.get(n) > 0) {
                System.out.println( countMap.get(n));
                System.out.println(countMap.containsKey(n));
                result.add(n); // ندخلو للنتيجة
                countMap.put(n, countMap.get(n) - 1); // نقص واحد من التكرار
            }
        }
        for (int n : nums2) {
            System.out.println(countMap.containsKey(n));
        }

        // 4. نحول List لآراي
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}