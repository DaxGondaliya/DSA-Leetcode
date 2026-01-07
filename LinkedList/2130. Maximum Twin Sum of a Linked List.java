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
        // find middle
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;
        while(fast != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse LL
        ListNode curr;
        ListNode next;
        ListNode temp = pre;
        curr = slow;
        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        //traverse from both ends
        int max = Integer.MIN_VALUE;
        ListNode first = head;
        ListNode last = pre;
        while(last != temp){
            max = Math.max(max , first.val+last.val);
            first = first.next;
            last = last.next;
        }  
        return max;
    }
}