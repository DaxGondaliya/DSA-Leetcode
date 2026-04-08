class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int xor=0;
        int mod=1000000007;
        for(int i=0 ; i<queries.length ; i++){
            int j=queries[i][0];
            while(j<=queries[i][1]){
                nums[j] = (int)((1L*nums[j]*queries[i][3]) % mod);
                j+=queries[i][2];
            }
        }
        for(int i=0 ; i<nums.length ; i++){
            xor^=nums[i];
        }
        return xor;
    }
}