

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static void main(String[] args) {
        
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = head ; 
        ListNode temp = head.next ; 
        while (temp != null) {
             if(temp.val == prev.val)
             {
                temp = temp.next; 
             }
             prev.next =temp;
             prev = temp;
             temp = temp.next;
        }
        prev.next = null;
        return  head ; 
    }
}