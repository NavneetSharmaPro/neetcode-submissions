class Solution {
    public int longestConsecutive(int[] nums) {
        // 1 greater than last means I can find the min and then walk 1 after another to see how long the streak lasts.
        // O(n) space O(n)
        Set<Integer> st = new HashSet<>();
        for(int num: nums) st.add(num);
        int max = 0;
        for(int num: nums) {
            // int cSum = 0;
            int m = num;
            while(st.contains(m + 1)) m++;
            // System.out.println("csum before : " + cSum + " m: " + m + " m - num = " + (m - num));
            max = Math.max(max, m - num + 1);
            // System.out.println("csum after " + cSum + " m: " + m + " oSum : " + oSum);
            // oSum = Math.max(cSum, oSum); 
            // System.out.println("osum after " + cSum + " m: " + m + " oSum : " + oSum);
        }
        return max;
    }
}
