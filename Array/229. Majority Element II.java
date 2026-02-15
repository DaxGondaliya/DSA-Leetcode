class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Booyre's Moore Voting algo
        ArrayList<Integer> ans = new ArrayList<>();
        int num1 = 0,num2 = 0;
        int count1=0 , count2 = 0;

        for(int i=0 ; i<nums.length ; i++){
            if(count1 == 0 && num2 != nums[i]){
                num1 = nums[i];
                count1 = 1;
            }else if(count2 == 0 && num1 != nums[i]){
                num2 = nums[i];
                count2 = 1;
            }else if(num1 == nums[i]){
                count1++;
            }else if(num2 == nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }   
        }
        count1 = 0;
        count2 = 0;

        for(int i=0 ; i<nums.length ; i++){
            if(num1 == nums[i]){
                count1++;
            }else if(num2 == nums[i]){
                count2++;
            }
        }

        if(count1 > nums.length/3){
            ans.add(num1);
        }
        if(count2 > nums.length/3){
            ans.add(num2);
        }

        return ans;
    }
}