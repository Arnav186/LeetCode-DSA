class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int money = 0;

        for(int i = 0; i < cost.length; i=i+3){
            money += cost[cost.length - 1 - i];
            if(i+1 < cost.length){
                money += cost[cost.length - 1 - (i+1)];
            }
        }
        return money;
    }
}
