class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, res = 0;
        for(int num: nums) {
            count = (num == 1) ? count + 1 : 0;
            res = Math.max(count, res);
        }
        return res;
    }
}