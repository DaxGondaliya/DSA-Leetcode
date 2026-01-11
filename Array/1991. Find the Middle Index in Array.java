class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = 0;
        right[n-1] = 0;
        int j = n-2;
        for(int i=1 ; i<n ; i++){
            left[i] += left[i-1] + nums[i-1];
            right[j] += right[j+1] + nums[j+1];
            j--; 
        }

        int middleIndex = -1;
        for(int i=0 ; i<n ; i++){
            if(left[i] == right[i]){
                middleIndex = i;
                break;
            }
        }
        return middleIndex;
    }
}