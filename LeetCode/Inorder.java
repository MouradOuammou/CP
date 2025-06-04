import java.util.ArrayList;
import java.util.List;

public class Inorder {
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
 
    public static void main(String[] args) {
        
    }
        public List<Integer> inorderTraversal(TreeNode root) {
               List<Integer> result = new ArrayList<>();
    traverseInorder(root, result);
    return result;
    }
     private void traverseInorder(TreeNode node, List<Integer> result) {
    if (node == null) return;

    // Visiter le sous-arbre gauche
    traverseInorder(node.left, result);

    // Ajouter la valeur du noeud courant
    result.add(node.val);

    traverseInorder(node.right, result);
}

}
