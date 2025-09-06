public class MajorityElement {
    public static void main(String[] args) {
        
    }
    public int majorityElement(int[] nums) {
        int majority = nums[0]; 
        int votes = 1 ;
        for(int i = 0  ; i< nums.length ; i++) {
                if(votes == 0 ) {
                    votes ++ ;
                    majority = nums[i];
                }
                else if( majority == nums[i]) votes ++ ;
                else votes--;   
        }
        return majority;
    }
}
