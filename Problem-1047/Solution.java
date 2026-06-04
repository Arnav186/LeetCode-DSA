class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> q = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);

            if(!q.isEmpty() && q.peek() == a){
                q.pop();
            } else {
                q.push(a);
            }
        }
        String ans = "";
        while(!q.isEmpty()){
            ans = q.pop() + ans;
        }
        return ans;
    }
}
