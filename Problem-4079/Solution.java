class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for(int i = 2; i*i <= n; i++){
            if(prime[i]){
                for(int j = i*i; j <= n; j+=i){
                    prime[j] = false;
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        int sum = 0;

        for(int i = 2; i <= n; i++){
            if(prime[i] && sum + i <= s){
                ans.add(i);
                sum+=i;
            }
        }
        return ans;
    }
}
