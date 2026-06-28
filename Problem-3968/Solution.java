class Solution {
    public int maxDistance(String moves) {
        int underscore = 0;
        int a = 0;
        int b = 0;

        for(int i = 0; i < moves.length(); i++){
            char ch = moves.charAt(i);

            if(ch == 'U'){
                a++;
            }
            else if(ch == 'D'){
                a--;
            }
            else if(ch == 'R'){
                b++;
            }
            else if(ch == 'L'){
                b--;
            } else {
                underscore++;
            }
        }
        return Math.abs(a) + Math.abs(b) + underscore;
    }
}
