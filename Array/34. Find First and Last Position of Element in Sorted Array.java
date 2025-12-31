class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int lb=lowerBound(nums,target);
        int ub=upperBound(nums,target);
        int[] ans={lb,ub};
        return ans;
    }
    public int lowerBound(int[] nums, int target)
    {
        int ans=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                r=mid-1;
            }
            else if(nums[mid]>target)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
    }
    public int upperBound(int[] nums, int target)
    {
        int ans=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                l=mid+1;
            }
            else if(nums[mid]>target)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
    }
}