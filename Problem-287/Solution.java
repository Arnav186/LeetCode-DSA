class Solution {
    public int findDuplicate(int[] nums) {

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (res[nums[i]] == 1){
                return nums[i];
            }
            res[nums[i]]++;
        }
        return -1; 
    }
}
