

public class LInkedList {
    public static void main(String[] args) {
        
    }
    class ListNode {
        ListNode  next ;
        int val ;

        public ListNode(int x) {
            x = val;
            next = null;
        }
        
    }

    public static boolean  hasCycle(ListNode head) {
        if(head == null) return  false  ; 
        if(head.next == null) return  false ; 
        ListNode lent  = head ; 
        ListNode fast  = head ; 

        while(fast!= null && fast.next!= null ) {
            lent = lent.next;
            fast = fast.next.next;
            if(fast == lent) return  true;

        } 
        return false;
    }
    
}
