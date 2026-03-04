class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);

        int[] res = new int[2];
        int index = 0;

        for (int i = 0; i < nums.length; i++){
            if (i == nums.length-1 || nums[i] != nums[i+1]){
                res[index++] = nums[i];
            }
            else {
                i++;
            }
            if (index == 2){
                break;
            }
        }
        return res;
    }
}
