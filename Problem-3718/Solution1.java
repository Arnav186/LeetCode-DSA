class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = k;
        for(int num : nums){
            if(ans == num){
                ans += k;
            }
        }
        return ans;
    }
}
