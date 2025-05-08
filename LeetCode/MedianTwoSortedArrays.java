public class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int totalLeft = (m + n + 1) / 2; 
        
        // Recherche binaire sur le plus petit tableau (nums1)
        int left = 0;
        int right = m;
        
        while (left < right) {
            // i est le point de partition dans nums1
            int i = left + (right - left) / 2;
            // j est le point de partition dans nums2
            int j = totalLeft - i;
            
            // Vérification des conditions
            if (nums1[i] < nums2[j - 1]) {
                left = i + 1; // On doit augmenter i
            } else {
                right = i; // On doit diminuer i
            }
        }

        int i = left;
        int j = totalLeft - i;
        
        int maxLeft1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
        int minRight1 = (i == m) ? Integer.MAX_VALUE : nums1[i];
        
        int maxLeft2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
        int minRight2 = (j == n) ? Integer.MAX_VALUE : nums2[j];
        
        if ((m + n) % 2 == 1) {
            return Math.max(maxLeft1, maxLeft2);
        } else {
            return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
        }
    }

    public static void main(String[] args) {
        MedianTwoSortedArrays solution = new MedianTwoSortedArrays();
        
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2)); 
        
        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println(solution.findMedianSortedArrays(nums3, nums4)); 
        
        int[] nums5 = {10, 20, 30};
        int[] nums6 = {15, 25};
        System.out.println(solution.findMedianSortedArrays(nums5, nums6)); 
    }
}