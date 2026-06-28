class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        long count = 0;

        for(int i = 0; i < nums.length; i++){
            long sum = 0; 

            for(int j = i; j < nums.length; j++){
                sum = sum + nums[j];

                if(sum % 10 != x){
                    continue;
                }

                long temp = sum;

                while(temp >= 10){
                    temp = temp / 10;
                }

                if(temp == x){
                    count++;
                }
            }
        }
        return (int)count;
    }
}
