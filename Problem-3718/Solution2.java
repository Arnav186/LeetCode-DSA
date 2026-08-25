class Solution {
    public int missingMultiple(int[] nums, int k) {
        int num = k;
        Set<Integer> available = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            available.add(nums[i]);
        }

        while(available.contains(num)){
            num+=k;
        }
        return num;
    }
}
