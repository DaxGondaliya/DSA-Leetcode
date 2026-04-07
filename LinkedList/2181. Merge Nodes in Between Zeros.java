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
// class Solution {
//     public ListNode mergeNodes(ListNode head) {
//         ListNode res = new ListNode(-1);
//         ListNode r = res;
//         ListNode tmp = head.next;
//         int sum=0;

//         while(tmp != null){
//             if(tmp.val == 0){
//                 ListNode n = new ListNode(sum);
//                 r.next = n;
//                 r = r.next;
//                 sum = 0;
//             }else{
//                 sum += tmp.val;
//             }
//             tmp = tmp.next;
//         }
//         return res.next;
//     }
// }


class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode cur = head.next;
        ListNode pre = head.next;
        int sum = 0;

        while(cur != null){
            if(cur.val == 0){
                pre.val = sum;
                sum = 0;
                if(cur.next != null){
                    pre.next = cur.next;
                    pre = cur.next;
                }else pre.next = null;
            }else sum += cur.val;
            cur = cur.next;
        }
        return head.next;
    }
}
