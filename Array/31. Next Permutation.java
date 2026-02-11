class Solution {
    public void reverse(int nums[],int s,int e){
        while(s<e){
            int tmp = nums[s];
            nums[s++] = nums[e];
            nums[e--] = tmp;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        // First find the largest prefix match
        int index = -1;
        for(int i=n-2 ; i>=0 ; i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            reverse(nums,0,n-1);
            return ;
        }

        //now find >nums[i] but smallest to stay close , then swap it

        for(int i=n-1 ; i>index ; i--){
            if(nums[i]>nums[index]){
                int tmp = nums[i];
                nums[i] = nums[index];
                nums[index] = tmp;
                break;
            }
        }

        //now sort from index+1 to n-1 it is always in decreasing order so just reverse it;

        reverse(nums,index+1,n-1);
    }
}