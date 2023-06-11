package codingninja;

/****************************************************************

 Following is the class structure of the LinkedListNode class:

 class LinkedListNode<T> {
 T data;
 LinkedListNode<T> next;
 LinkedListNode(T data)
 {
 this.data = data;
 this.next = null;
 }
 }
 *****************************************************************/
// https://www.codingninjas.com/codestudio/problems/delete-node-in-a-linked-list_8230813?challengeSlug=striver-sde-challenge&leftPanelTab=1
// 30. Delete Node In A Linked List 
public class Solution30 {
    public static void deleteNode(LinkedListNode<Integer> node) {
        if (node.next != null) {
            node.data = node.next.data;
            node.next = node.next.next;
        }
    }
}