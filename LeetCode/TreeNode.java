

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
      public static void main(String[] args) {
        
      }
      public TreeNode sortedArrayToBST(int[] nums) {
            if(nums.length == 0 ) return  null ; 
            return ConstructFromArray(nums,0 ,  nums.length - 1) ; 
    }
        public TreeNode ConstructFromArray(int [] nums , int left , int right){
               if(left> right)  return null ;  
           int     mid  = ( left+right )/2 ; 
               TreeNode node  = new TreeNode(nums[mid]);
                node.left = ConstructFromArray(nums,left, mid -1);
                node.right = ConstructFromArray(nums,mid+1, right);
                return node ; 
        }
}
