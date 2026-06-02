class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> S = new Stack<>();
        Stack<Character> T = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);

            if(a != '#'){
                S.push(a);
            } else if (!S.isEmpty()){
                S.pop();
            }
        }
        for(int i = 0; i < t.length(); i++){
            char b = t.charAt(i);

            if(b != '#'){
                T.push(b);
            } else if (!T.isEmpty()){
                T.pop();
            }
        }
    return S.equals(T);
    }
}
