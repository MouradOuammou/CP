
import java.util.List;

public  class interesctionList {
     public class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  
  }
 

  public  ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);
        while(lenA > lenB) {
            lenA -- ; 
            headA = headA.next;
        }
        while(lenA < lenB) {
            lenB -- ; 
            headB = headB.next;
        }
        while(headA!=headB){
            headA = headA.next;
            headB  = headB.next;
        }
        return headA;
            

    }
        private int getListLength(ListNode node) {
        int size = 0 ; 
        while(node != null) {
            size ++ ;
                    node = node.next;  

        }
        return size;
      }
}