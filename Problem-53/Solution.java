class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int total = nums[0];

        for (int i = 1; i < nums.length; i++) {
            total = total + nums[i];
            total = Math.max(nums[i], total );
            ans = Math.max(ans, total);
        }
        return ans;
    }
}
