package codingninja;

// https://www.codingninjas.com/codestudio/problems/delete-kth-node-from-end_8230725?challengeSlug=striver-sde-challenge&leftPanelTab=1
public class Solution28 {
    public static Node removeKthNode(Node head, int k) {

        Node dummy = new Node();
        dummy.next = head;


        Node fast = dummy;
        Node slow = dummy;

        while (k > 0) {
            fast = fast.next;
            k--;
        }

        Node prev = null;
        while (fast != null) {
            prev = slow;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = slow.next;
        return dummy.next;
    }
}