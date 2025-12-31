class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int m1 = Integer.MAX_VALUE;
        int m2 = Integer.MAX_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]<=m1){
                m1 = nums[i];
            }else if(nums[i]<=m2){
                m2 = nums[i];
            }else{
                return true;
            }
        }
        return false;
    }
}