class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++) mp.put(nums[i], i);
        for(int i = 0; i < nums.length; i++) {
            if(mp.containsKey(target - nums[i])) {
                if(mp.get(target - nums[i]) != i) return new int[]{i, mp.get(target - nums[i])};
            } else mp.put(target - nums[i], i);
        }
        return new int[]{0,0};
    }
}
