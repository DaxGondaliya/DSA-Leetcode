class Solution {
    public int repeatedNTimes(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            max = Math.max(max,nums[i]);
        }
        int unique = 0;
        int count[] = new int[max+1];
        for(int i=0 ; i<nums.length ; i++){
            count[nums[i]]++;
            if(count[nums[i]]==1){
                unique++;
            }
        }
        int n = 0;
        for(int i=0 ; i<count.length ; i++){
            if(2.*count[i] == nums.length && unique == count[i]+1){
                n = i;
            }
        }
        return n;
    }
}