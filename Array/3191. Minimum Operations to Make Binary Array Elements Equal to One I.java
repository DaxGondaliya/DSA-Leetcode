class Solution {
    public int minOperations(int[] nums) {
        int i=0, n=nums.length;
        int cnt = 0;
        while(i<n-2){
            if(nums[i]==0){
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                cnt++;
            }
            i++;
        }
        return (nums[n-1]==1 && nums[n-2]==1) ? cnt : -1;
    }
}