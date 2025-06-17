

public class ReversekNode {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override 
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode curr = this;
            while (curr != null) {
                sb.append(curr.val);
                if (curr.next != null) sb.append(" -> ");
                curr = curr.next;
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        ListNode res = new ListNode(1,
                            new ListNode(2,
                                new ListNode(3,
                                    new ListNode(4,
                                        new ListNode(5)))));

        System.out.println("Avant le swap :");
        System.out.println(res);

        ListNode reverseK = reverseKGroup(res , 2);

        System.out.println("Après le swap :");
        System.out.println(reverseK);
    }

    // Méthode pour inverser un groupe de k nœuds dans la liste
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head ;
        ListNode pre = dummy , curr = head ;
            while( curr!= null) {
                boolean space = checkHasSpace(k,curr);
                if(space){
                    pre = reverse (pre,curr,k);
                    curr  =pre.next;
                }
                else{
                    break;
                }
            }
        return dummy.next;
    }
    public static boolean checkHasSpace(int k , ListNode curr){
        for(int i = 1 ; i<=k ; i++){
            if(curr == null) return false ; 
            curr   =curr.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode pre , ListNode curr , int  k){
        for(int i= 0 ; i< k-1  ; i++){
            ListNode nex  = curr.next;
            curr.next = nex.next ; 
            nex.next = pre.next ; 
            pre.next = nex;
        }
        return curr;
    }
        
}
