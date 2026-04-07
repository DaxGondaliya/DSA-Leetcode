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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int ans[][] = new int[m][n];
        int left=0,right=n-1;
        int up=0,bottom=m-1;
        ListNode temp = head;
 
        while(left<=right && up<=bottom){
            for(int i=left ; i<=right ; i++){
                int v = (temp!=null) ? temp.val : -1;
                if(v!=-1) temp = temp.next;
                ans[up][i] = v;
            }

            for(int i=up+1 ; i<=bottom ; i++){
                int v = (temp!=null) ? temp.val : -1;
                if(v!=-1) temp = temp.next;
                ans[i][right] = v;
            }

            if(up<bottom){
                for(int i=right-1 ; i>=left ; i--){
                    int v = (temp!=null) ? temp.val : -1;
                    if(v!=-1) temp = temp.next;
                    ans[bottom][i] = v;
                }
            }

            if(left<right){
               for(int i=bottom-1 ; i>up ; i--){
                    int v = (temp!=null) ? temp.val : -1;
                    if(v!=-1) temp = temp.next;
                    ans[i][left] = v;
                } 
            }
            left++;
            right--;
            up++;
            bottom--;
        }
        return ans;
    }
}

// class Solution {
//     public int[][] spiralMatrix(int r, int c, ListNode head) {
//         int matrix[][] = new int[r][c];
//         for(int i=0;i<r;i++){
//             Arrays.fill(matrix[i],-1);
//         }

//         int top = 0, bottom = r - 1, left = 0, right = c - 1;

//         ListNode curr = head;

//         while (curr != null && top<=bottom && left<=right) {
//             for (int i = left; i <= right && curr!=null; i++) {
//                 matrix[top][i] = curr.val;
//                 curr = curr.next;
//             }
//             top++;
//             for (int i = top; i <= bottom && curr!=null; i++) {
//                 matrix[i][right] = curr.val;
//                 curr = curr.next;
//             }
//             right--;
//             if (top <=bottom) {
//                 for (int i = right; i >= left && curr!=null; i--) {
//                     matrix[bottom][i] = curr.val;
//                     curr = curr.next;
//                 }
//             }
//             bottom--;
//             if (left <=right) {
//                 for (int i = bottom; i >= top && curr!=null; i--) {
//                     matrix[i][left] = curr.val;
//                     curr = curr.next;
//                 }
//                 left++;
//             }
//         }

//         return matrix;
//     }
// }