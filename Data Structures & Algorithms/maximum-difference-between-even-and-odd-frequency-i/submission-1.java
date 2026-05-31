class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        for(char ch: s.toCharArray()) mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        int minEven = Integer.MAX_VALUE;
        int maxOdd = Integer.MIN_VALUE;
        for(int value: mp.values()) {
            if(value % 2 == 0) minEven = Math.min(minEven, value);
            else maxOdd = Math.max(maxOdd, value);
        }
        return (minEven != Integer.MIN_VALUE || maxOdd != Integer.MIN_VALUE) ? maxOdd - minEven : 0;
    }
}