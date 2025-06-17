    class TreeNode {
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
        public static boolean isSameTree(TreeNode p, TreeNode q) {
            return CompareNode(p, q);
        }
        public static boolean CompareNode(TreeNode a, TreeNode b) { 
            if (a == null && b == null) return true;
            if ((a == null && b != null) || (b == null && a != null)) return false;
            if (a.val != b.val) return false;
            return CompareNode(a.left, b.left) && CompareNode(a.right, b.right); 
        }
    }