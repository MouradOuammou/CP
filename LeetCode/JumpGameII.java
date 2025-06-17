public class JumpGameII {
    public static void main(String[] args) {
        int [] nums  = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
     public static int jump(int[] nums) {
    if (nums.length == 1) return 0;
    
    int jumps = 0;
    int currentEnd = 0;
    int coverage = 0;
    
    // On s'arrête à nums.length - 1 car on n'a pas besoin de sauter depuis la dernière position
    for (int i = 0; i < nums.length - 1; i++) {
        // Mettre à jour la position la plus lointaine atteignable
        coverage = Math.max(coverage, i + nums[i]);
        
        // Si on atteint la fin de la portée du saut actuel
        if (i == currentEnd) {
            jumps++;
            currentEnd = coverage;
            
            // Si on peut déjà atteindre la fin, on peut s'arrêter
            if (currentEnd >= nums.length - 1) {
                break;
            }
        }
    }
    
    return jumps;
}
}

