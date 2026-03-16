class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a  = 0;
        int b = numbers.length - 1;

        while(numbers[a] + numbers[b] != target){
            if(numbers[a] + numbers[b] < target){
                a++;
            }
            else {
                b--;
            }
        }
        int[] result = new int[2];
        result[0] = a + 1;
        result[1] = b + 1;
        return result;
    }
}
