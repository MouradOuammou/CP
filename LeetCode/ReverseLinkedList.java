import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args) {
        
    }
        public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }  
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 public ListNode reverseList(ListNode head) {
      Stack<Integer> res = new Stack<>();
      ListNode current  =head ; 
      while(current!= null) {
        res.push(current.val);
        current = current.next;
      }
      ListNode result  = new ListNode(-1);
      ListNode ptr = result  ; 
      while(!res.isEmpty()) {
        ptr.next = new ListNode(res.pop());
        ptr = ptr.next ;
      }
      return ptr.next;
    }
}
