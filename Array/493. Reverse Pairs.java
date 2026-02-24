class Solution {
    public void merge(int nums[] , int low , int mid , int high){
        ArrayList<Integer> tmp = new ArrayList<>();
		int left = low;
		int right = mid+1;
		while(left<=mid && right<=high){
			if(nums[left]<=nums[right]){
				tmp.add(nums[left++]);
			}else{
				tmp.add(nums[right++]);
			}
		}
		while(left<=mid){
			tmp.add(nums[left++]);
		}
		while(right<=high){
			tmp.add(nums[right++]);
		}
		
		for(int i=low ; i<=high ; i++){
			nums[i] = tmp.get(i-low);
		}
    }
    public int CountPairs(int nums[] , int low , int mid , int high){
        int cnt = 0;
        int right = mid+1;
        for(int i=low ; i<=mid ; i++){
            //here use 2L because it may be overflow from integer
            while(right <= high && nums[i]>2L*nums[right]) right++;
            cnt += (right - (mid+1));
        }
        return cnt;
    }
    public int mergesort(int nums[] , int  low , int high){
        int cnt = 0;
        if(low>=high){
            return cnt;
        }
        int mid = low + (high-low)/2;
        cnt += mergesort(nums,low,mid);
        cnt += mergesort(nums,mid+1,high);
        cnt += CountPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return cnt;
    }
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
}