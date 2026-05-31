class Solution {
    public String minWindow(String s, String t) {
        // 2 freq maps to check if I have what I need in window what I want in T
        Map<Character, Integer> mpT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for(char ch: t.toCharArray()) mpT.put(ch, mpT.getOrDefault(ch, 0) + 1);

        int[] res = new int[]{-1, -1};
        int resLen = Integer.MAX_VALUE;
        int have = 0, need = mpT.size();
        int left = 0, right = 0;

        while(right < s.length()) {
            // get right key
            char key = s.charAt(right);
            //put in window
            window.put(key, window.getOrDefault(key, 0) + 1);
            // check if window's freq matches mpT
            if(mpT.containsKey(key) && window.get(key).equals(mpT.get(key))) have++;

            while(have == need) {
                // we have 'A' solution, now we want to shrink and get 'the smallest' solution
                if((right - left + 1) < resLen) {
                    resLen =  right - left + 1;
                    res[0] = left;
                    res[1] = right;
                }
                char keyLeft = s.charAt(left);
                // reduce left's freq in window and check if it's still >= in mpT
                window.put(keyLeft, window.get(keyLeft) - 1);
                if(mpT.containsKey(keyLeft) && window.get(keyLeft) < mpT.get(keyLeft)) have--;
                left++;
            }
            right++;
        }
    return (resLen == Integer.MAX_VALUE) ? "" : s.substring(res[0], res[1] + 1);
    }
}
