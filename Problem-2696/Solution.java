class Solution {
    public int minLength(String s) {
        Stack <Character> q = new Stack<>();

        for(int i  = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(!q.isEmpty() &&
                ((q.peek() == 'A' && c == 'B') || 
                (q.peek() == 'C' && c == 'D'))
            ) {
                q.pop();
            } else {
                q.push(c);
            }
        }   
        return q.size();
    }
}
