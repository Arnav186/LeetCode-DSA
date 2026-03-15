class Solution {
    public int superPow(int a, int[] b) {

        int ans = 1;
        a = a % 1337;

        for (int digit : b) {
            ans = pow(ans, 10) * pow(a, digit) % 1337;
        }
        return ans;
    }

    public int pow(int x, int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res = (res * x) % 1337;
        }
        return res;
    }
}
