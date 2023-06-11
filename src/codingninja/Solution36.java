package codingninja;

import java.util.PriorityQueue;

/**
 * @description: [Description of the class/file]
 * @author: Pawan Maurya
 */

//  Flatten A Linked List
//  https://www.codingninjas.com/codestudio/problems/flatten-a-linked-list_8230827?challengeSlug=striver-sde-challenge

public class Solution36 {

    public static Node flattenLinkedList(Node head) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>((x, y) -> x.data - y.data);
        while (head != null) {
            priorityQueue.add(head);
            Node next = head.next;
            while (head.child != null) {
                priorityQueue.add(head.child);
                head.child = head.child.child;
            }
            head = next;
        }

        Node curr = new Node();
        Node ans = curr;

        while (!priorityQueue.isEmpty()) {
            ans.child = priorityQueue.poll();
            ans = ans.child;
        }
        return curr.child;
    }
}