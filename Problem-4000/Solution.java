class Solution {
    public int largestInteger(int n, int s) {
        if(s > 9 * n){
            return -1;
        }

        if(s == 0){
            return 0;
        }

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(s>0){
                int digit = Math.min(9,s);
                ans.append(digit);
                s = s - digit;
            } else {
                ans.append(0);
            }
        }
        return Integer.parseInt(ans.toString());
        
    }
}
