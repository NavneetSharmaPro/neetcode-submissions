class Solution {
    public int trap(int[] heights) {
        int n = heights.length;
        int res = 0;
        int l = 0, r = n -1;
        int lMax = heights[l], rMax = heights[r];
        while(l < r) {
            if(lMax < rMax) {
                l++;
                lMax = Math.max(lMax, heights[l]);
                res += lMax - heights[l];
            } else {
                r--;
                rMax = Math.max(rMax, heights[r]);
                res += rMax - heights[r];
            }
        }
        return res;
    }
}
