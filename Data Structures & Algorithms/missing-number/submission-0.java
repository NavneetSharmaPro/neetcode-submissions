class Solution {
    public int missingNumber(int[] nums) {
        // basic soln1 sumTotal - sumOfNWholeNos
        int actualSum = 0;
        int overallSum = (nums.length)*(nums.length + 1)/2;
        for(int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }

        return overallSum - actualSum;
    }
}
