//COUNTING SORT

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = costs[0];
        int icecreams = 0;

        for (int i = 0; i < costs.length; i++){
            if (costs[i] > max){
                max = costs[i];
            }
        }
        int[] count = new int[max+1];
        
        for (int i = 0; i < costs.length; i++){
            count[costs[i]]++;
        }

        for(int i = 0; i <= max; i++){
            while(count[i] > 0 && coins >= i){
                coins = coins - i;
                icecreams++;
                count[i]--;
            }
        }
        return icecreams;
    }
}
