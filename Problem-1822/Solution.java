class Solution {
    public int arraySign(int[] nums) {
        int a = 0;
        int b = 0;
    
        for(int i = 0; i <nums.length; i++){
            if (nums[i] < 0){
                a = a + 1;
            }
            else if (nums[i] > 0){
                b = b + 1;
            } 
            else if (nums[i] == 0){
                return 0;
            }
        }
        if (a % 2 == 0){
            return 1;
        }
        else {
            return -1;
        }
    }
}
