package codingninja;

//  37. Rotate Linked List
// https://www.codingninjas.com/codestudio/problems/rotate-linked-list_8230752?challengeSlug=striver-sde-challenge
public class Solution37 {
    public static Node rotate(Node head, int k) {

        if (head == null)
            return head;

        Node temp = head;
        int count = 0;


        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        count++;
        k = k % count;

        temp.next = head;
        int nodeWillBeNull = count - k;

        while (nodeWillBeNull > 1) {
            nodeWillBeNull--;
            head = head.next;

        }
        Node newHead = head.next;
        head.next = null;
        return newHead;
    }
}