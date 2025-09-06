



public class RemoveLinkedList {
    public static void main(String[] args) {
        
    }
    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
    public ListNode removeByValue(ListNode head, int val) {
    while (head != null && head.val == val) {
        head = head.next;
    }

    ListNode current = head;
    ListNode prev = null;

    while (current != null) {
        if (current.val == val) {
            if (prev != null) {
                prev.next = current.next;
            }
        } else {
            prev = current;
        }
        current = current.next; 
    }
    return head;
    
}
}