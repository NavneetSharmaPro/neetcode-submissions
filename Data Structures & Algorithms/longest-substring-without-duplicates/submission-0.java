class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int max = 0;
        int fast = 0, slow = 0;
        while(fast < s.length()) {
            if(!st.contains(s.charAt(fast))) {
                st.add(s.charAt(fast));
                max = Math.max(max, fast - slow + 1);
                fast++;
            } else {
                st.remove(s.charAt(slow));
                slow++;
            }
        }
        return max;
    }
}
