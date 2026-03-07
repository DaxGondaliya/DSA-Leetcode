class Solution {
    public int signFunc(int n){
        if(n%2==0) return 1;
        return -1;
    }
    public int arraySign(int[] nums) {
        int cnt = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==0) return 0;
            else if(nums[i]<0) cnt++;
        }
        return signFunc(cnt);
    }
}