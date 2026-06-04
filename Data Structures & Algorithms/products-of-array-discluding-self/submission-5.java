class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);
        int iter = 1;
        for(int i = 0; i < nums.length; i++) {
            res[i] = res[i] * iter;
            iter = iter * nums[i];
        }
        iter = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            res[i] = res[i] * iter;
            iter = iter * nums[i];
        }

        return res;
    }
}  
