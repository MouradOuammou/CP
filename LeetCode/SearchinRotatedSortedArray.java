public class SearchinRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};  // exemple de tableau pivoté
        int target = 0;
        int result = search(nums, target);
        System.out.println("Index de " + target + " : " + result);
    }

    public static int search(int[] nums, int target) {
        int debut = 0;
        int fin = nums.length - 1;

        while (debut <= fin) {
            int mid = (debut + fin) / 2;

            if (nums[mid] == target) {
                return mid;  
            }

            // Si la partie gauche est triée
            if (nums[debut] <= nums[mid]) {     
                // Si target est dans cette partie triée, utilise dichotomie ici
                if (nums[debut] <= target && target < nums[mid]) {
                    return dichotomie(nums, target, debut, mid - 1);
                } else {
                    // sinon cherche dans l’autre partie (droite)
                    debut = mid + 1;
                }
            }
            // Sinon la partie droite est triée
            else {
                // Si target est dans cette partie triée, utilise dichotomie ici
                if (nums[mid] < target && target <= nums[fin]) {
                    return dichotomie(nums, target, mid + 1, fin);
                } else {
                    // sinon cherche dans l’autre partie (gauche)
                    fin = mid - 1;
                }
            }
        }

        return -1; 
    }
    public static int dichotomie(int[] arrays, int x, int debut, int fin) {
        while (debut <= fin) {
            int mid = (debut + fin) / 2;
            if (arrays[mid] == x) return mid;
            else if (arrays[mid] < x) debut = mid + 1;
            else fin = mid - 1;
        }
        return -1;
    }
}
