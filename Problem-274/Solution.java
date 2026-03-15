class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++){
            int a = citations.length - i;
            if (citations[i] >= a){
                return a;
            }
        }
        return 0;
    }
}
