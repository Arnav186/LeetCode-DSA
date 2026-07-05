class Solution {
    public int maxDigitRange(int[] nums) {
        int range = -1;
        for(int num : nums){
            range = Math.max(range, range(num));
        }
        int sum = 0;
    
        for(int num : nums){
            if(range(num) == range){
                sum = sum + num;
            }
        }
        return sum;
    }

    

    private int range(int num){
        int max = 0;
        int min = 9;

        if(num == 0){
            return 0;
        }
        while(num > 0){
            int digit = num % 10;
            max = Math.max(max, digit);
            min = Math.min(min, digit);
            num = num / 10;
        }
        return max - min;
    }
}
