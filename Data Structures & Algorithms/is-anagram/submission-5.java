class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] mp = new int[26];

        for(char ch: s.toCharArray()) mp[ch - 'a']++;
        for(char ch: t.toCharArray()) mp[ch - 'a']--;

        for(int i: mp) if(i != 0) return false;
        return true;
    }
}
