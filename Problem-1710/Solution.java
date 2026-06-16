class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int ans = 0;

        for(int i = 0; i < boxTypes.length && truckSize > 0; i++){
            int carry = Math.min(boxTypes[i][0], truckSize);

            ans = ans + (carry * boxTypes[i][1]);
            truckSize = truckSize - carry;
        }
        return ans;
    }
}
