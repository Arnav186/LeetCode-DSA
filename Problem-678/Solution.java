class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> p = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '(' ){
                p.push(i);
            } 
            else if (s.charAt(i) == '*'){
                star.push(i);
            } 
            else {
                if (!p.isEmpty()){
                    p.pop();
                } 
                else if (!star.isEmpty()){
                    star.pop();
                }
                else {
                    return false;
                }
            }
        }

        while(!p.isEmpty() && !star.isEmpty()){
            if(p.pop() > star.pop()){
                return false;
            }
        }
        return p.empty();
    }
}
