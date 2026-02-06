class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0,j;

        for(j=0 ; j<nums.length ; j++){
            if(i<=j && (long)nums[i]*k<(long)nums[j]){
                i++;
            }
        }
        return i;
    }
}