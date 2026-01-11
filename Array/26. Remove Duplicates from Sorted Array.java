class Solution {
    public int removeDuplicates(int[] nums) {
        //Two Pointers
        int i=0;
        for(int j=1 ; j<nums.length ; j++){
            if(nums[i]<nums[j]){
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i+1;
    }
}

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int count = 0;
//         for(int i=0 ; i<nums.length-1 ; i++){
//             if(nums[i]!=nums[i+1]){
//                 nums[count] = nums[i];
//                 count++;
//             }
//         }
//         nums[count] = nums[nums.length-1];
//         return count+1;
//     }
// }