class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxsum = Math.max(maxsum, Math.abs(sum));
            if (sum < 0) {
                sum = 0;
            }
        }
        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxsum = Math.max(maxsum, Math.abs(sum));
            if (sum > 0) {
                sum = 0;
            }
        }
        return maxsum;
    }
}
