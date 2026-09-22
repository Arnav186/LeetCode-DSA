class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int count = 0;
        int temp = 0;

        for(String s : bank){
            count = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '1'){
                    count++;
                }
            }
            if(count > 0){
                ans += temp * count;
                temp = count;
            }
        }
        return ans;
    }
}
