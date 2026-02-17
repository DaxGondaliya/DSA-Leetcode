class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> fre = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            fre.put(nums[i],fre.getOrDefault(nums[i],0)+1);
        }
        int ans[] = new int[2];
        int i=0;
        for(Integer n : fre.keySet()){
            if(fre.get(n)==2){
                ans[i] = n;
                i++;
            }
        }
        return ans;
    }
}