class Solution {
    static public int minimumDifference(int[] nums, int k) {
        if (k==1) return 0;

        Arrays.sort(nums);

        int n=nums.length;
        int diff=Integer.MAX_VALUE;
        
        for(int l=0, r=k-1; r<n; r++,l++){
            diff=Math.min(diff, nums[r]-nums[l]);
        }
        return diff;
    }
}