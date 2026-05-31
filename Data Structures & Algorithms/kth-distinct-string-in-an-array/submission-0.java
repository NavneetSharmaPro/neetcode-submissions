class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> mp = new HashMap<>();
        Set<String> dist = new HashSet<>();
        for(String str: arr) mp.put(str, mp.getOrDefault(str, 0) + 1);

        for(String key : mp.keySet()) {
            if(mp.get(key) == 1) dist.add(key);
        }

        for(String str: arr) {
            if(dist.contains(str)){
                if(k == 1) return str; 
                else k--;
            } 
        }
        return "";
    }
}