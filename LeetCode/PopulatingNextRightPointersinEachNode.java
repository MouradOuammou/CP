public class PopulatingNextRightPointersinEachNode {

    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root = connect(root);
        System.out.println(root);

    }

    public static Node connect(Node root) {
        if(root==null) return null  ; 
        Node leftmost  = root ; 
        while(leftmost.left != null) {
            Node head  = leftmost ; 
            while(head!= null) {
                head.left.next = head.right ; 

                if(head.next!= null) {
                    head.right.next = head.next.left ;
                }
                  head = head.next;
            }
            leftmost = leftmost.left ; 
        }
        return root ; 
    }
}
