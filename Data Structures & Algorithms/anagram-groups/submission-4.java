class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(mp.containsKey(key)) mp.get(key).add(str);
            else {
                List<String> list = new ArrayList<>();
                list.add(str);
                mp.put(key, list);
            }
        }
        return new ArrayList<>(mp.values());
    }
}
