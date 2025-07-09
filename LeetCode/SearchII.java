public class SearchII {
    public static void main(String[] args) {
        SearchII s = new SearchII();

        int[] nums1 = {2,5,6,0,0,1,2};
        int target1 = 0;
        int[] nums2 = {2,5,6,0,0,1,2};
        int target2 = 3;
        System.out.println(s.search(nums1, target1)); 
        System.out.println(s.search(nums2, target2)); 
    }

    public boolean search(int[] nums, int target) {
        return BinarySearch(nums, 0, nums.length - 1, target) != -1;
    }
    public static int BinarySearch(int[] arr, int low, int high, int x) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return mid;
            if (arr[low] < arr[mid]) {
                if (arr[low] <= x && x < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else if (arr[mid] < arr[high]) {
                if (arr[mid] < x && x <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            else {
                if (arr[low] == arr[mid]) low++;
                if (arr[high] == arr[mid]) high--;
            }
        }
        return -1; 
    }
}
