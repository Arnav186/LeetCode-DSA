class Solution {
    public int minAddToMakeValid(String s) {
        Stack <Character> q = new Stack<>();
        char[] ch = s.toCharArray();

        for(int i = 0; i < s.length(); i++){
            char a = ch[i];

            if(q.isEmpty()){
                q.push(a);
            } 
            if(q.peek() == '(' && a == ')'){
                q.pop();
            } else {
                q.push(a);
            }
        }
        return q.size();
    }
}
