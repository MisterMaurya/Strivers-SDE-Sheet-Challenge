package codingninja;

/**
 * @description: [https://www.codingninjas.com/codestudio/problems/merge-two-sorted-linked-lists_8230729?challengeSlug=striver-sde-challenge&leftPanelTab=1]
 * @author: Pawan Maurya
 */

public class Solution27 {


    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {

        if (first == null)
            return second;

        if (second == null)
            return first;

        if (first.data > second.data) {
            LinkedListNode<Integer> x = first;
            first = second;
            second = x;
        }

        LinkedListNode<Integer> ans = first;
        LinkedListNode<Integer> head = first;
        first = first.next;

        while (first != null && second != null) {
            if (first.data <= second.data) {
                ans.next = first;
                first = first.next;
            } else {
                ans.next = second;
                second = second.next;
            }
            ans = ans.next;
        }

        while (first != null) {
            ans.next = first;
            ans = ans.next;
            first = first.next;
        }

        while (second != null) {
            ans.next = second;
            ans = ans.next;
            second = second.next;
        }
        return head;
    }
}
