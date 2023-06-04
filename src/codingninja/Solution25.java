package codingninja;


/**
 * @description: [https://www.codingninjas.com/codestudio/problems/reverse-linked-list_8230724?challengeSlug=striver-sde-challenge&leftPanelTab=1]
 * @author: Pawan Maurya
 */

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Solution25 {
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) {
        if (head == null)
            return head;

        LinkedListNode ans = null;
        while (head != null) {
            LinkedListNode next = head.next;
            head.next = ans;
            ans = head;
            head = next;
        }
        return ans;
    }
}