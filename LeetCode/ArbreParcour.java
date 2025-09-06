import java.util.ArrayList;
import java.util.List;

public class ArbreParcour {
    public static void main(String[] args) {
        
    }
    public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
     public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            preorderHelper(root,result);
            return  result;
    }
   public static  void preorderHelper(TreeNode node, List<Integer> result)  {
            if(node == null) return;
            result.add(node.val);
            preorderHelper(node.left, result);
            preorderHelper(node.right, result);

    }

     public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
           posterorderHelper(root,result);
            return  result;
    }

     public  static void posterorderHelper(TreeNode node , List<Integer> result) {
            if (node == null) return;
            posterorderHelper(node.left, result);
            posterorderHelper(node.right, result);
            result.add(node.val);

    }
    
}
