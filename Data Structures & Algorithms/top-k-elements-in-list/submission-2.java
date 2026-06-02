class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // REDO
        Map<Integer, Integer> fmp = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        int[] res = new int[k];

        for(int num: nums) fmp.put(num, fmp.getOrDefault(num, 0) + 1);

        for(int key: fmp.keySet()) {
            int freq = fmp.get(key);

            if(bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }

        int counter = 0;

        for(int i = bucket.length - 1; i >= 0 && counter < k; i--) {
            if(bucket[i] != null) {
                for(int num: bucket[i]) res[counter++] = num;
                if(counter == k) break;
            }
        }
        return res;
    }
}
