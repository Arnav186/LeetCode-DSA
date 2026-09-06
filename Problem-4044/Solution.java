class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int half = n / 2;
    
        long total = 0;
        for(int num : nums){
            total += num;
        }

        long firsthalf = 0;
        for(int i = 0; i < half; i++){
            firsthalf += nums[i];
        }

        int ans = 0;

        for(int i = 0; i < n; i++){
            if(2 * firsthalf > total){
                ans++;
            }

            firsthalf -= nums[i];
            firsthalf += nums[(i + half) % n];
        }
        return ans;
    }
    
}
