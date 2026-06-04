class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int max = 0;
        for(int num: nums) st.add(num);

        for(int i = 0; i < nums.length; i++) {
            if(!st.contains(nums[i] - 1)) {
                int curr = nums[i];
                int cmax = 1;
                while(st.contains(curr + 1)) {
                    curr++;
                    cmax++;
                }
                max = Math.max(max, cmax);
            }
        }
        return max;
    }
}
