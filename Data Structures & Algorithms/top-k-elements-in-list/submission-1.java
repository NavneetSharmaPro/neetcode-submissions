class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        Queue<Integer> pq = new PriorityQueue<>((a,b) -> mp.get(b) - mp.get(a));
        for(int num: nums) mp.put(num, mp.getOrDefault(num, 0) + 1);
        for(int key: mp.keySet()) pq.offer(key);
        int[] res = new int[k];
        while(k-- > 0) res[k] = pq.poll();
        return res;
    }
}
