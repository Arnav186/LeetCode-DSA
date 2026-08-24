class Solution {
    public int alternatingSum(int[] nums) {
        int add = 0;
        int sub = 0;

        for(int i = 0; i < nums.length; i=i+2){
            add = add + nums[i];
        }

        for(int i = 1; i < nums.length; i=i+2){
            sub = sub + nums[i];
        }
        return add - sub;
    }
}
