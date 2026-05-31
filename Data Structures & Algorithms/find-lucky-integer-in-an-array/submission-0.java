class Solution {
    public int findLucky(int[] arr) {
        int max = -1;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num: arr) mp.put(num, mp.getOrDefault(num, 0) + 1);
        for(int key: mp.keySet()) {
            if(key == mp.get(key)) max = Math.max(max, key);
        }
        return max;
    }
}