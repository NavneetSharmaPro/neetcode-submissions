class Solution {
    public boolean isAlphaNum(char ch) {
        return (ch >= 'a' && ch <= 'z') ||
        (ch >= 'A' && ch <= 'Z') ||
        (ch >= '0' && ch <= '9');
    }
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while(start < end) {
            while(start < end && (!isAlphaNum(s.charAt(start)))) start++;
            while(start < end && (!isAlphaNum(s.charAt(end)))) end--;
            if(Character.toUpperCase(s.charAt(start)) != Character.toUpperCase(s.charAt(end))) return false;
            start++; end--;
        }
        return true;
    }
}
