class Solution {
    public boolean check(int arr[] , int x , int k){
        int p = 1 , total = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(total + arr[i] <= x) total += arr[i];
            else{
                p++;
                total = arr[i];
            }
        }
        return p>k;
    }
    public int splitArray(int[] nums, int k) {
        int l=Integer.MIN_VALUE , r = 0;
        for(int n : nums){
            l = Math.max(n,l);
            r += n;
        }
        while(l<=r){
            int mid = (l+r)/2;
            if(check(nums,mid,k)) l = mid+1;
            else r = mid-1;
        }
        return l;
    }
}