class Solution {
    public int rob(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for(int i = 0; i < nums.length; i++){
            int ans = Math.max(max1, max2 + nums[i]);
            max2 = max1;
            max1 = ans;
        }
    return max1;
    }
}
