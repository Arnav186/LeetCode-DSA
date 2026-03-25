class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> temp, int[] nums, int remain, int start) {
        if (remain < 0) return;

        if (remain == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(ans, temp, nums, remain - nums[i], i); 
            temp.remove(temp.size() - 1); 
        }
    }
}
