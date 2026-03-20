class Solution {
    public boolean total(int arr[],int x,int h){
        int total = 0;
        for(int i=0 ; i<arr.length ; i++){
            total += Math.ceil((double)arr[i]/x);
        }
        return total<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=0;

        for(int n:piles){
            r = Math.max(r,n);
        }

        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(total(piles,mid,h)){
                ans = mid;
                r = mid-1;
            }else l = mid+1;
        }
        return l;
    }
}