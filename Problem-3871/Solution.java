class Solution {
    public long countCommas(long n) {
        if(n < 999){
            return 0;
        }

        long comas = 0;
        long point = 1000;

        while(point <= n){
            comas += n - point + 1;
            point *= 1000;
        }
        return comas;
    }
}
