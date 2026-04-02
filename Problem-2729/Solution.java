class Solution {
    public boolean isFascinating(int n) {
        String s = "" + n + (2 * n) + (3 * n);

        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }

        Arrays.sort(arr);

        if (arr[0] != 1) {
            return false;
        }

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] == arr[i] || arr[i+1] != arr[i] + 1) {
                return false;
            }
        }

        return true;
    }
}
