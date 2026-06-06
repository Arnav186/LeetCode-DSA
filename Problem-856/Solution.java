class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                st.push(0);
            } else {
                int v = st.pop();

                if (v == 0) {
                    st.push(st.pop() + 1);
                } else {
                    st.push(st.pop() + 2 * v);
                }
            }
        }
        return st.pop();
    }
}
