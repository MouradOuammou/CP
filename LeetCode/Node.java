class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Étape 1 : compter la taille sans perdre la tête
        int taille = 0;
        ListNode temp = head;
        while (temp != null) {
            taille++;
            temp = temp.next;
        }
        
        // Étape 2 : calculer la position à supprimer depuis le début
        int position = taille - n + 1;
        
        // Étape 3 : cas où on supprime le premier élément
        if (position == 1) {
            return head.next;
        }
        
        // Étape 4 : parcourir jusqu'au nœud avant celui à supprimer
        ListNode current = head;
        for (int i = 1; i < position - 1; i++) {    
            current = current.next;
        }
        
        // Étape 5 : modifier le lien pour sauter le nœud supprimé
        current.next = current.next.next;
        
        // Étape 6 : retourner la tête modifiée
        return head;
    }

    // Méthode pour tester facilement
    public static void main(String[] args) {
        // Exemple : liste [1,2,3,4,5], supprimer le 2e depuis la fin
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        Solution solution = new Solution();
        ListNode result = solution.removeNthFromEnd(head, 2);

        // Afficher la liste résultat
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Résultat attendu : 1 2 3 5
    }
}
