class Solution {
    public int longestConsecutive(int[] nums) {
        //if(!st.contains(num - 1)) CONFIRMS if the element is at the start of sequence, else it skips, without this we compare each sequence and in worst case it becomes O(n^2)
        Set<Integer> st = new HashSet<>();
        int max = 0;
        for(int num: nums) st.add(num);
        for(int num: st) { // iterate over set instead of nums if u want FAST
            if(!st.contains(num - 1)) { // this check is important as it converts O(n^2) to O(n)
                int m = num; // local iterator which will move forward and see how many consecutive sequence are there;
                while(st.contains(m)) m++;
                max = Math.max(max, m - num);
            }
        }
        return max;
    }
}
