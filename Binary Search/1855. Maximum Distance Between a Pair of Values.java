class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0;
        for(int i=0 ; i<nums1.length ; i++){
            int k=nums1[i];
            int l=i,r=nums2.length-1;
            while(l<=r){
                int mid = (l+r)/2;
                if(nums2[mid]>=k) l=mid+1;
                else r=mid-1;
            }
            max = Math.max(max,r-i);
        }
        return max;
    }
}