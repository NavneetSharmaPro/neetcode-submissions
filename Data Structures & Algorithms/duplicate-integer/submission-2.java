class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int num: nums) st.add(num);
        return st.size() != nums.length;
    }
}