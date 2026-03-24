class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        sol(ans, temp, s, 0);
        return ans;
    }

    private void sol(List<List<String>> ans, List<String> temp, String s, int index){
        if (index == s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < s.length(); i++){
            if (isPalindrome(s, index, i)){
                temp.add(s.substring(index, i+1));
                sol(ans, temp, s, i+1);
                temp.remove(temp.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s, int t, int u){
        while (t < u){
            if(s.charAt(t++) != s.charAt(u--))
            return false;
        }
        return true;
    }
}
