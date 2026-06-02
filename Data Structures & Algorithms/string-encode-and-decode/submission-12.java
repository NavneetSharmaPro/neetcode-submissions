class Solution {
    private final String SEPARATER = String.valueOf((char) 258);
    // private final String EMPTY = String.valueOf((char) 259); // not required 

    private String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        return String.join(SEPARATER, strs);
    }

    private List<String> decode(String str) {
        if (str == "") return new ArrayList<>();
        return Arrays.asList(str.split(SEPARATER, -1)); // -1 is critical to prevent java from deleting training empty strings
    }
}