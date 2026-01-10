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
    public ListNode partition(ListNode head, int x) {
        ListNode slist = new ListNode(-1);
        ListNode blist = new ListNode(-1);

        ListNode small = slist;
        ListNode big = blist;

        while(head != null){
            if(head.val >= x){
                big.next = head;
                big = big.next;
            }else{
                small.next = head;
                small = small.next;
            }
            head = head.next;
        }
        small.next = blist.next;
        big.next = null;

        return slist.next;
    }
}