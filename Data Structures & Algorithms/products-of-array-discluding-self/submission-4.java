class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] prefixArr = new int[nums.length];
        // int[] suffixArr = new int[nums.length];
        // int[] res = new int[nums.length];
        // prefixArr[0] = nums[0];
        // for(int i = 1; i < nums.length; i++) {
        //     prefixArr[i] = prefixArr[i - 1] * nums[i];
        // }
        // suffixArr[nums.length - 1] = nums[nums.length - 1];
        // for(int i = nums.length - 2; i >= 0; i--) {
        //     suffixArr[i] = suffixArr[i + 1] * nums[i];
        // }

        // for(int i = 0; i < nums.length; i++) {
        //     if(i == 0) res[i] = suffixArr[i + 1];
        //     else if(i == nums.length - 1) res[i] = prefixArr[i - 1];
        //     else res[i] = prefixArr[i - 1] * suffixArr[i + 1];
        // }
        // return res;

        // soln 2
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);
        int productTracker = 1;
        for(int i = 0; i < nums.length; i++) {
            res[i] *= productTracker;
            productTracker *= nums[i];
        }
        productTracker = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            res[i] *= productTracker;
            productTracker *= nums[i];
        }
        return res;
    }
}  
