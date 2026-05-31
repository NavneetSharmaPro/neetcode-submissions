class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for(String str: strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if(mp.containsKey(key)) mp.get(key).add(str);
            else mp.put(key, new ArrayList<>(Arrays.asList(str)));
        }
        return new ArrayList<>(mp.values());
    }
}
