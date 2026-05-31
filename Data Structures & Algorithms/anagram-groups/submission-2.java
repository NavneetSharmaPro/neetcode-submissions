class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // solution 3 : use constant array of size 26 since the input has characters a-z only;
        Map<String, List<String>> bigMap = new HashMap<>();
        
        for(String str: strs) {
            //first make freq map;
            int[] freq = new int[26];
            // Map<Character, Integer> freqMap = makeFreqMap(str);
            for(char ch: str.toCharArray()) {
                freq[ch - 'a']++;
            }
            String key = Arrays.toString(freq);

            if(bigMap.containsKey(key)) {
                bigMap.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                bigMap.put(key, list);
            }
        }
        
        // for(List<String> val: bigMap.values()) {
        //     res.add(val);
        // }
        List<List<String>> res = new ArrayList<>(bigMap.values());
        return res;

    }
}
