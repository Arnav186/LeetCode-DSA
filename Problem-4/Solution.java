class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;

        int[] ans = new int[a + b];

        int i = 0, j = 0, k = 0;

        while (i < a && j < b) {
            if (nums1[i] < nums2[j]) {
                ans[k++] = nums1[i++];
            } else {
                ans[k++] = nums2[j++];
            }
        }

        while (i < a) {
            ans[k++] = nums1[i++];
        }

        while (j < b) {
            ans[k++] = nums2[j++];
        }

        int n = ans.length;

        if (n % 2 != 0) {
            return ans[n / 2];
        } else {
            return (ans[n / 2 - 1] + ans[n / 2]) / 2.0;
        }
    }
}
