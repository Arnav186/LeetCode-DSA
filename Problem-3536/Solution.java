class Solution {
    public int maxProduct(int n) {
        int a = -1;
        int b = -1;

        while(n != 0){
            int remainder = n % 10;

            if(a <= remainder){
                b = a;
                a = remainder;
            }
            else if (b < remainder){
                b = remainder;
            }
            n /= 10;
        }
        return a*b;
    }
}
