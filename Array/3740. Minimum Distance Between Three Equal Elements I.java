class Solution {
    public int minimumDistance(int[] nums) {
        // abs(i-j) + abs(j-k) + abs(k-i)
        // = (j-i) + (k-j) + (k-i)
        // = k-i + k-i 
        // = 2*(k-i)
        int n = nums.length;
        if(n<=2) return -1;
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<n-2 ; i++){
            for(int j=i+1 ; j<n-1 ; j++){
                if(nums[i]==nums[j]){
                    for(int k=j+1 ; k<n ; k++){
                        if(nums[j]==nums[k]){
                            min = Math.min(min,2*(k-i));
                            break;
                        }
                    }
                }
            }
        }
        if(min == Integer.MAX_VALUE) return -1;
        return min;
    }
}