class Solution {
    public boolean possible(int arr[] , int div , int x){
        int total = 0;
        for(int i=0 ; i<arr.length ; i++){
            total += Math.ceil((double)arr[i]/div);
        }
        return total<=x;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1,right = 0;
        for(int n:nums){
            right = Math.max(n,right);
        }

        while(left<=right){
            int mid = (left+right)/2;
            if(possible(nums,mid,threshold)) right = mid-1;
            else left = mid+1;
        }
        return left;
    }
}