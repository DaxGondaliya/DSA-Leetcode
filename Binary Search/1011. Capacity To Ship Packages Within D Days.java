class Solution {
    public boolean possible(int arr[] , int cap , int days){
        int day=1 , load = 0;
        for(int n:arr){
            if(load+n>cap){
                day++;
                load = n;
            }else load+= n;
        }
        return day<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=weights[0],r=0;
        for(int n : weights){
            l = Math.max(n,l);
            r += n;
        }

        while(l<=r){
            int mid = (l+r)/2;
            if(possible(weights,mid,days)) r = mid-1;
            else l = mid+1;
        }
        return l;
    }
}