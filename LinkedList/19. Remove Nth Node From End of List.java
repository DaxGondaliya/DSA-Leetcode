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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        if(size == n){
            head = head.next;
            return head;
        }
        int firstTon = size - n;
        ListNode pre = head;
        int i=1;
        while(i<firstTon){
            pre = pre.next;
            i++;
        } 
        pre.next = pre.next.next;
        return head;
    }
}


// fast slow approach
// ListNode fast = head, slow = head;
//         for (int i = 0; i < n; i++) fast = fast.next;
//         if (fast == null) return head.next;
//         while (fast.next != null) {
//             fast = fast.next;
//             slow = slow.next;
//         }
//         slow.next = slow.next.next;
//         return head;