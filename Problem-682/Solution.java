class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            String ch = operations[i];

            if (ch.equals("+")) {
                int last = stack.pop();
                int seclast = stack.pop();
                int newtop = last + seclast;
                stack.push(seclast);
                stack.push(last);
                stack.push(newtop);
            } else if (ch.equals("D")) {
                int last = stack.pop();
                int newScore = 2 * last;
                stack.push(last);
                stack.push(newScore);
            } else if (ch.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.valueOf(ch));
            }
        }
        int ans = 0;

        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}
