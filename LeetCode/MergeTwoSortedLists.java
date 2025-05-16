public class MergeTwoSortedLists {
    public static void main(String[] args) {

//        ListNode list1 = null;
//        ListNode list2 = null;
//        System.out.println("Test 1: Listes vides");
//        ListNode mergedList = ListNode.mergeTwoLists(list1, list2);
//        ListNode.printList(mergedList);
//
//        // Test avec une liste vide et une liste non vide
//        System.out.println("\nTest 2: Liste vide et liste non vide");
//        list1 = null;
//        list2 = new ListNode(1);
//        list2.next = new ListNode(3);
//        list2.next.next = new ListNode(5);
//        mergedList = ListNode.mergeTwoLists(list1, list2);
//        ListNode.printList(mergedList);
//
//        // Test avec deux listes non vides
//        System.out.println("\nTest 3: Deux listes non vides");
//        list1 = new ListNode(1);
//        list1.next = new ListNode(2);
//        list1.next.next = new ListNode(4);
//        list2 = new ListNode(1);
//        list2.next = new ListNode(3);
//        list2.next.next = new ListNode(4);
//        mergedList = ListNode.mergeTwoLists(list1, list2);
//        ListNode.printList(mergedList);
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        ListNode list2 = new ListNode(4);
        list2.next = new ListNode(5);
        list2.next.next = new ListNode(6);
        System.out.println(ListNode.mergeTwoLists(list1, list2));
    }
    public static class ListNode {
      int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }

        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
              ListNode res = new ListNode(0);
              ListNode current = res;
            if(list1 == null && list2 == null) {
                return null;
            }
            if(list1 == null) {
                return list2;
            }
            if(list2 == null) {
                return list1;
            }
            while(list1 != null && list2 != null) {
                if(list1.val < list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                }
                else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }
            if (list1 != null) {
                current.next = list1;
            }
            if (list2 != null) {
                current.next = list2;
            }
        return res.next;
        }
        public static void printList(ListNode head) {
            if (head == null) {
                System.out.println("La liste est vide.");
                return;
            }

            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}
