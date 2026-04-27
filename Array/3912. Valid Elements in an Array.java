class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        if (n == 1) {
            ans.add(nums[0]);
            return ans;
        }

        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        maxLeft[0] = nums[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], nums[i]);
        }

        maxRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], nums[i]);
        }

        for (int i = 0; i < n; i++) {

            if (i == 0 || i == n - 1) ans.add(nums[i]);
            else if (nums[i] > maxLeft[i - 1] || nums[i] > maxRight[i + 1]) ans.add(nums[i]);
            
        }

        return ans;
    }
}