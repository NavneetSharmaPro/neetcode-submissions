class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        // while(n != 0) { 
        //     n&=(n-1); removes rightmost set bit
        //     count++; 
        // }
        while(n != 0) {
            if((n & 1) == 1) count++;
            n = n >>> 1;
        }
        return count; 
    }
}
