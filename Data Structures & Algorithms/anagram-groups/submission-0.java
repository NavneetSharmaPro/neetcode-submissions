class Solution {
    private Map<Character, Integer> makeFreqMap(String str) {
        Map<Character, Integer> mp = new HashMap<>();
        for(char ch: str.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch,0) + 1);
        }
        return mp;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        // all the anagrams which are of same root would have same sorted value
        // act and cat both sorted are -> act
        // key[act] -> value[cat, act] {Complexity M*NlogN}
        // Solution 2: use hashmap instead of sorting making complexity M*N (reduced sorting from nlogn to n)
        // map would have key -> freq map map<character int>
        // value would be List<String>
        Map<Map<Character, Integer>, List<String>> bigMap = new HashMap<>();
        
        List<List<String>> res = new ArrayList<>();
        for(String str: strs) {
            //first make freq map;
            Map<Character, Integer> freqMap = makeFreqMap(str);
            if(bigMap.containsKey(freqMap)) {
                bigMap.get(freqMap).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                bigMap.put(freqMap, list);
            }
        }
        
        for(List<String> val: bigMap.values()) {
            res.add(val);
        }
        return res;

    }
}
