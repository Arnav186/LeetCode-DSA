class Solution {
    public int totalNumbers(int[] digits) {
        int[] fre = new int[10];
        int ans = 0;

        for(int digit : digits){
            fre[digit]++;   
        }

        for(int a = 1; a <= 9; a++){
            for(int b = 0; b <= 9; b++){
                for(int c = 0; c <= 8; c+=2){
                    if(fre[a] == 0 || fre[b] == 0 || fre[c] == 0){
                        continue;
                    }
                    fre[a]--;

                    if(fre[b] > 0){
                        fre[b]--;
                    
                        if(fre[c] > 0){
                            ans++;
                        }
                        fre[b]++;
                    }
                    fre[a]++;
                }
            }
        }
        return ans;
    }
}
