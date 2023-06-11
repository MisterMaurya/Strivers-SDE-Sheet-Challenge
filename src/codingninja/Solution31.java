package codingninja;

//31. Intersection of Two Linked Lists
// https://www.codingninjas.com/codestudio/problems/intersection-of-two-linked-lists_8230688?challengeSlug=striver-sde-challenge&leftPanelTab=0
public class Solution31 {
    public static int findIntersection(Node firstHead, Node secondHead) {

        Node first = firstHead;
        Node second = secondHead;

        if (first == null || second == null)
            return 0;

        while (first != second) {
            if (first == null)
                first = secondHead;
            else {
                first = first.next;
            }
            if (second == null)
                second = firstHead;
            else {
                second = second.next;
            }

        }
        return first.data;
    }
}