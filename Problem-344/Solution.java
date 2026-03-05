class Solution {
    public void reverseString(char[] s) {
        int a = 0;
        int b = s.length - 1;
        ans(s,a,b);
    }

    public void ans(char[] s, int a, int b){
        if (a >= b){
            return;
        }
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
        ans(s, ++a, --b);
    }
}
