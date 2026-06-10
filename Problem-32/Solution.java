class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> q = new Stack<>();

        int max = 0;
        int start = -1;
        int count;
        
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                q.push(i);
            } else {
                if (q.isEmpty()) {
                    start = i;
                } else {
                    q.pop();

                    if (q.isEmpty()) {
                        count = i - start;
                    } else {
                        count = i - q.peek();
                    }
                    if (count > max) {
                        max = count;
                    }
                }
            }
        }
        return max;
    }
}
