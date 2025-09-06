
import java.util.LinkedList;
import java.util.Queue;


class SymetricTree {

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
}
    
    public  boolean isSymmetric(TreeNode root) {
            if(root == null ) return true ;
            Queue<TreeNode> leftTree = new LinkedList<>();
            Queue<TreeNode> RightTree = new LinkedList<>();
            leftTree.add(root.left);
            RightTree.add(root.right);
            while(!leftTree.isEmpty() &&  !RightTree.isEmpty()) {
                TreeNode lefNode = leftTree.poll();
                TreeNode RightNode = RightTree.poll();
                if(lefNode == null && RightNode == null) continue;
                if(lefNode == null || RightNode == null) return  false;
                if(lefNode.val != RightNode.val) return false ; 
                leftTree.add(lefNode.left);
                leftTree.add(lefNode.right);
                RightTree.add(RightNode.right);
                                RightTree.add(RightNode.left);

            }
            return  true ; 

    }
}