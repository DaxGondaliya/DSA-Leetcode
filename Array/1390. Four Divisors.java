class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        for(int i=0  ; i<nums.length ; i++){
            int cnt = 0;
            int sum = 0;
            for(int j=1 ; j<=Math.sqrt(nums[i]) ; j++){
                if(nums[i]%j==0){
                    int other = nums[i]/j;
                    if(other == j){
                        cnt++;
                        sum += j;
                    }else{
                        cnt += 2;
                        sum += j + other;
                    }
                }
            }
            if(cnt==4){
                totalSum += sum;
            }
        }
        return totalSum;
    }
}
