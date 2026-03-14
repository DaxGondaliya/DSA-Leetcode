class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        if(n==2) return nums;

        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }
            
        int g1=0 , g2=0;
        int diff = xor & -xor;
        for(int num : nums){
            if((diff & num)==0) g1 ^= num;
            else g2 ^= num;
        }
        return (g1<g2) ? new int[] {g1,g2} : new int[] {g2,g1};
    }
}