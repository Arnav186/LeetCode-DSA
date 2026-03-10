class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0]= -1;
        ans[1]= -1;

        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                ans[1] = i;
            }
        }

        for(int i = nums.length-1 ; i>=0 ;i--){
            if(target == nums[i]){
                ans[0] = i;
            }
        }
        return ans;
    }
}
