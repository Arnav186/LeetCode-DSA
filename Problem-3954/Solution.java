class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;

        for(int i = 0; i < 10000; i++){
            if(Math.abs(n - i) <= k && (n & i) == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}
