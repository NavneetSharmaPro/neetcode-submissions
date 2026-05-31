class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Character> mpS = new HashMap<>();
        Map<Character, Character> mpT = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if(!mpS.containsKey(ss)) mpS.put(ss, tt);
            if(!mpT.containsKey(tt)) mpT.put(tt, ss);
            if(mpS.get(ss) != tt || mpT.get(tt) != ss) return false;
        } 
        return true;
    }
}