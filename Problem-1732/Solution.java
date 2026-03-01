class Solution {
    public int largestAltitude(int[] gain) {
        int list[] = new int[gain.length+1];
        list[0]=0;

        int max = 0;

        for(int i = 1 ; i < gain.length+1 ; i++){
            list[i] = gain[i-1] + list[i-1];
            if(list[i]>max){
                max=list[i];
            }
        }
        return max;
    }
}
