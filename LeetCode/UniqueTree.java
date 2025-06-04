import java.util.ArrayList;
import java.util.List;

public class UniqueTree {
    public static class TreeNode {
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

        // Pour affichage (optionnel)
        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

    public static void main(String[] args) {
        UniqueTree solution = new UniqueTree();
        List<TreeNode> trees = solution.generateTrees(3);
        System.out.println("Nombre d'arbres générés : " + trees.size());
    }

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return buildTrees(1, n);
    }

    private List<TreeNode> buildTrees(int start, int end) {
        List<TreeNode> allTrees = new ArrayList<>();
        if (start > end) {
            allTrees.add(null);
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> leftTrees = buildTrees(start, i - 1);
            System.out.println(leftTrees);
            List<TreeNode> rightTrees = buildTrees(i + 1, end);
            System.out.println(rightTrees);


            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    allTrees.add(root);
                }
            }
        }

        return allTrees;
    }
}
