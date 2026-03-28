class Solution {
        /*how get ans l+r lets break down,
        ans = arr[r]+need more
        = arr[r]+k-missing
        = arr[r]+k-(arr[r]-(r+1))
        = arr[r]+k-arr[r]+r+1
        = r+1+k
        =l+k */
    public int findKthPositive(int[] arr, int k) {
        int l=0 , r=arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k) l = mid+1;
            else r = mid-1;
        }
        return l+k;
    }
}