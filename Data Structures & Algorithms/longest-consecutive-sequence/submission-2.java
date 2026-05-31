class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int max = 0;
        for(int num: nums) st.add(num);
        for(int num: st) { // iterate over set instead of nums if u want FAST
            int m = num; // local iterator which will move forward and see how many consecutive sequence are there;
            while(st.contains(m)) m++;
            max = Math.max(max, m - num);
        }
        return max;
    }
}
