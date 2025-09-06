public class Balanced {
        public static class TreeNode {
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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        
        root.right.left = null;
        root.right.right = null;
        
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
         boolean result = isBalanced(root);
         System.out.println(result);
    }

     public static  boolean isBalanced(TreeNode root) {
             return checkHeight(root) != -1;

    }
    public static  int checkHeight(TreeNode node) {
         if (node == null) return 0; 
            int leftHeight = checkHeight(node.left); 
        if (leftHeight == -1) return -1;

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1;
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
