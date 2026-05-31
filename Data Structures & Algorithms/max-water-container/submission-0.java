class Solution {
    public int maxArea(int[] heights) {
        // 2 pointer, move whichever is smaller of the 2
        int left = 0;
        int right = heights.length - 1;
        int maxArea = -1;

        while(left < right) {
            int area = Math.min(heights[left], heights[right])*(right - left);
            if(area <= maxArea) {
                if(heights[left] > heights[right]) right--;
                else left++;
            } else maxArea = area;
            
        }
        return maxArea;
    }
}
