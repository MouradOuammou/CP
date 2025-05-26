class Remove {
    public static void main(String[] args) {
        

    }
     public static  int removeElement(int[] nums, int val) {
        int n = nums.length , count = 0;
        for(int i =0; i<n; i++){
               int valeur = nums[i] ; 
               if( valeur != val) {
                    nums[count] = nums[i];
                    count ++ ; 
            }
        }
        return count;
    }
}