class Solution {
    public int sumOfUnique(int[] nums) {
        int[] a = new int[101];

        for (int i = 0; i < nums.length; i++) {
            a[nums[i]]++;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (a[nums[i]] == 1) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
