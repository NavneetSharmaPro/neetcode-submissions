class Solution {
    private String SEPARATER = String.valueOf((char) 258);
    private String EMPTY = String.valueOf((char) 259);

    private String encode(List<String> strs) {
        if(strs.isEmpty()) return EMPTY;
        return String.join(SEPARATER, strs);
    }

    private List<String> decode(String str) {
        if (str == EMPTY) return new ArrayList<>();
        return Arrays.asList(str.split(SEPARATER, -1));
    }
}
