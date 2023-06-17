package codingninja;

import codingninja.helperclass.ListNode;

// 29. Add Two Numbers
// https://leetcode.com/problems/add-two-numbers/
public class Solution29 {
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        int carry = 0;

        while (head1 != null || head2 != null || carry > 0) {

            int x = head1 == null ? 0 : head1.val;
            int y = head2 == null ? 0 : head2.val;
            int res = x + y + carry;
            int ele = res % 10;
            carry = res / 10;
            curr.next = new ListNode(ele);
            curr = curr.next;
            head1 = head1 == null ? head1 : head1.next;
            head2 = head2 == null ? head2 : head2.next;
        }
        return ans.next;
    }
}