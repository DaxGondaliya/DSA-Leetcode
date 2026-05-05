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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        int size = 0;
        ListNode s = head;
        while(s != null){
            s = s.next;
            size++;
        }
        int i=0;
        while(i<(k%size)){
            ListNode temp = head;
            ListNode pre = null;
            while(temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            pre.next = null;
            temp.next = head;
            head = temp;
            i++;
        }
        return head;
    }
}