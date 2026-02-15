class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int preSum = 0;
        int remove = 0;
        int cnt = 0;

        map.put(0,1);

        for(int i=0 ; i<nums.length ; i++){
            preSum += nums[i];
            remove = preSum-k;
            cnt += map.getOrDefault(remove,0);
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return cnt;
    }
}