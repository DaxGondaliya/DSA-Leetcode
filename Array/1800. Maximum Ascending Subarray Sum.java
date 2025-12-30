class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int i;
        for(i=0 ; i<nums.length-1 ; i++){
            if(nums[i]>=nums[i+1]){
                sum += nums[i];
                max = Math.max(max,sum);
                sum = 0;
            }else{
                sum += nums[i];
            }
        }
        sum += nums[i];
        max = Math.max(max,sum);
        return max;
    }
}