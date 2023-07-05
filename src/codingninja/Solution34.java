package codingninja;

import java.util.*;
import java.io.*;

/****************************************************************

 Following is the class structure of the LinkedListNode class:

 class LinkedListNode<T> {
 T data;
 LinkedListNode<T> next;

 public LinkedListNode(T data) {
 this.data = data;
 }
 }
 *****************************************************************/
// 34.Palindrome Linked List
// https://www.codingninjas.com/studio/problems/palindrome-linked-list_8230717?challengeSlug=striver-sde-challenge
public class Solution34 {

    public static boolean isPalindrome(LinkedListNode<Integer> head) {

        if (head == null)
            return true;

        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        LinkedListNode<Integer> temp = slow.next;
        temp = reverse(temp);

        slow = head;
        while (temp != null) {
            if (!slow.data.equals(temp.data))
                return false;
            slow = slow.next;
            temp = temp.next;
        }

        return true;

    }

    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> temp) {
        LinkedListNode<Integer> dummy = null;
        while (temp != null) {
            LinkedListNode<Integer> next = temp.next;
            temp.next = dummy;
            dummy = temp;
            temp = next;
        }
        return dummy;
    }

}