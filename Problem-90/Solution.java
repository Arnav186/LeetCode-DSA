class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int no_subsets = 1 << n;
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < no_subsets; i++) {

            List<Integer> list = new ArrayList<>();
            
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return new ArrayList<>(ans);
    }
}
