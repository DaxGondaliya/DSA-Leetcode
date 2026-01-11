class Solution {
    public int longestSubarray(int[] nums) {
        int j=0;
        int i=0;
        int max = Integer.MIN_VALUE;
        int zero = 0;
        for(j=0 ; j<nums.length ; j++){
            if(nums[j]==0){
                zero++;
            }
            while(zero > 1){
                if(nums[i]==0){
                    zero--;
                    i++;
                }else{
                    i++;
                }
            }
            max = Math.max(max,j-i);
        }
        return max;
    }
}