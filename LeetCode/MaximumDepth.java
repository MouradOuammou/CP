public class  MaximumDepth{
    public class TreeNode {
        int val ;
        TreeNode left ;
        TreeNode  right ;

        public TreeNode(int val) {
            this.val = val ;
        }
     
        public TreeNode(int val , TreeNode left 
        ,TreeNode  right ) {
            this.val = val ;
            this.left = left ; 
            this.right = right;
        }

    }
    public static void main(String[] args) {
        
    }
    public int maxDepth(TreeNode root) {
            
            if(root == null) return 0 ; 
            int leftDepth =  maxDepth(root.left);
            int RightDepth =  maxDepth(root.right);
            return 1 + Math.max(leftDepth, RightDepth);
            
    }
}