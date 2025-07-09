class Solution1 {
    public static void main(String[] args) {
        // Création de la liste : 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1,
                            new ListNode(2,
                                new ListNode(3,
                                    new ListNode(4))));

        System.out.println("Avant le swap :");
        System.out.println(head);

        ListNode swapped = swapPairs(head);

        System.out.println("Après le swap :");
        System.out.println(swapped);
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode point = dummy;

        while (point.next != null && point.next.next != null) {
            ListNode swap1 = point.next;
            ListNode swap2 = point.next.next;

            swap1.next = swap2.next;
            swap2.next = swap1;
            point.next = swap2;

            point = swap1; 
        }

        return dummy.next;
    }
}
