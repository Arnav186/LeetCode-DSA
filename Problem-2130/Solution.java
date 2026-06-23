/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = head;

        while (temp1 != null && temp1.next != null) {
            temp1 = temp1.next.next;
            temp2 = temp2.next;
        }

        ListNode prev = null;

        while (temp2 != null) {
            ListNode next = temp2.next;
            temp2.next = prev;
            prev = temp2;
            temp2 = next;
        }

        ListNode first = head;
        ListNode second = prev;
        int ans = 0;

        while (second != null) {
            ans = Math.max(ans, first.val + second.val);
            first = first.next;
            second = second.next;
        }
        return ans;
    }
}
