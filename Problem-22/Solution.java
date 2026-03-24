class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        sol(n, "", 0, 0, ans);
        return ans;
    }

    private void sol(int n, String curr, int open, int close, List<String> ans){
        if (curr.length() == 2 * n){
            ans.add(curr);
            return;
        }

        if (open < n){
            sol(n, curr + "(", open+1, close, ans);
        }

        if (close < open){
            sol(n, curr + ")", open, close+1, ans);
        }
    }
}
