class Solution {
    public long maxAlternatingSum(int[] nums) {
        int pointer = nums.length / 2;

        long first  = 0;
        long second = 0;

        long[] squares = new long[nums.length];
        for(int i = 0; i < nums.length; i++){
            squares[i] = (long)nums[i] * nums[i];
        }

        Arrays.sort(squares); 

        for(int i = 0; i < pointer; i++){
            first+=squares[i];
        }

        for(int j = pointer; j < nums.length; j++){
            second += squares[j];
        }
        return second - first;
    }
}
