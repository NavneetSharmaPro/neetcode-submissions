class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        res[arr.length - 1] = -1;
        int rightMax = -1;
        for(int i = arr.length - 1; i >= 0; i--) {
            res[i] = rightMax;
            rightMax = Math.max(arr[i], rightMax);
        }
        return res;
    }
}