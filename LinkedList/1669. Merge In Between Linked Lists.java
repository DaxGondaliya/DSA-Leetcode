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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count = 0;
        ListNode ath = list1;
        ListNode bth = list1;
        ListNode last2 = list2;

        while(count != a-1){
            ath = ath.next;
            count++;
        }
        count = 0;
        while(count != b){
            bth = bth.next;
            count++;
        }
        while(last2.next != null){
            last2 = last2.next;
        }
        ath.next = null;
        ath.next = list2;
        last2.next = bth.next;
        bth.next = null;
        return list1;
    }
}