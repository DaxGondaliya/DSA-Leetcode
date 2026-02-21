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
        public ListNode insertGreatestCommonDivisors(ListNode head) {
            ListNode temp = head;
            while(temp.next != null){
                int a = temp.val;
                int b = temp.next.val;

                //Euclidian algo to find gcd if a%b==0 then b is gcd; 
                while(a%b!=0){
                    int rem = a%b;
                    a = b;
                    b = rem;
                }
                ListNode gcd = new ListNode(b);
                gcd.next = temp.next;
                temp.next = gcd;

                temp = temp.next.next;
            }
            return head;
        }
    }