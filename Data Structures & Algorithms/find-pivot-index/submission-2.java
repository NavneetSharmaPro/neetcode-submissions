class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int[] postfixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++) prefixSum[i] = prefixSum[i - 1] + nums[i];
        postfixSum[nums.length - 1] = nums[nums.length - 1]; 
        for(int i = nums.length - 2; i >= 0; i--) postfixSum[i] = postfixSum[i + 1] + nums[i];

        for(int i = 0; i < nums.length; i++) {
            int left = (i == 0) ? 0 : prefixSum[i - 1];
            int right = (i == nums.length - 1) ? 0 : postfixSum[i + 1];
            if(left == right) return i;
        }
        return -1;
    }
}