class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        int longest = 1;

        for(int n : nums){
            set.add(n);
        }

        for(int n : set){
            if(!set.contains(n-1)){
                int cnt = 1;
                int x = n;
                while(set.contains(x+1)){
                    x++;
                    cnt++;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}