class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        long squareSum = 1;

        while(n > 0){
            int a = n % 10;
            digitSum += a;
            squareSum += a*a;
            n/= 10;
        }
        return (squareSum - digitSum > 50);
    }
}
