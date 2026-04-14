class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int difference = -1;

        for(int i = 0; i < nums.length; i++){
            if (nums[i] > min){
                int diff = nums[i] - min;
                if (diff > difference) {
                    difference = diff;
                }
            }
            else {
                min = nums[i];
            }
        }
        return difference;
    }
}
