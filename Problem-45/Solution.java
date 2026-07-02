class Solution {
    public int jump(int[] nums) {
        int ans = 0;
        int maxjump = 0;
        int lastjump = 0;

        for(int i = 0; i < nums.length-1; i++){
            maxjump = Math.max(maxjump, i + nums[i]);
            
            if(maxjump >= nums.length-1){
                ans++;
                break;
            }
            if(i == lastjump){
                ans++;
                lastjump = maxjump;
            }
        }
        return ans;
    }
}
