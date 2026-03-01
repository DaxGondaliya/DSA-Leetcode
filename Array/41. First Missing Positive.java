class Solution {
    public int firstMissingPositive(int[] nums) {
        //cyclic sort
        int n = nums.length;
        int i=0;

        while(i<n){
            if(nums[i]>0 && nums[i]<=n && nums[i] != nums[nums[i]-1]){
                int idx = nums[i]-1;
                int tmp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = tmp;
            }else{
                i++;
            }
        }

        for(int j=0 ; j<n ; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return n+1;
    }
}