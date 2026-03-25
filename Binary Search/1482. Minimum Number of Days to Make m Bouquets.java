class Solution {
    public boolean possible(int arr[] , int  day , int m , int k){
        int count=0,total = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]<=day) count++;
            else{
                total += count/k;
                count = 0;
            }
        }
        total += count/k;
        if(total >= m) return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n<(long)m*k) return -1;

        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            min = Math.min(min,bloomDay[i]);
            max = Math.max(max,bloomDay[i]);
        }

        int left=min , right=max;
        while(left<=right){
            int mid = (left+right)/2;
            if(possible(bloomDay,mid,m,k)) right = mid-1;
            else left = mid+1;
        }
        return left;
    }
}