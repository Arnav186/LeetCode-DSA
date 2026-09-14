class Solution {
    public long shadowPairs(int[] nums) {
        ArrayList<Integer> Stack = new ArrayList<>();
        long ans = 0;

        for (int x : nums) {

            int l = 0;
            int r = Stack.size();

            while (l < r) {
                int mid = (l + r) / 2;

                if (Stack.get(mid) < x) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }
            ans+=l;

            while(!Stack.isEmpty() && Stack.get(Stack.size() - 1) > x){
                Stack.remove(Stack.size()-1);
            }
            Stack.add(x);
        }
        return ans;
    }
}
