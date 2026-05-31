class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char current_char = s.charAt(i);
            if(current_char == '{' || current_char == '(' || current_char == '[') st.push(current_char);
            else if(current_char == '}' && !st.isEmpty() && st.peek() == '{') st.pop();
            else if(current_char == ']' && !st.isEmpty() && st.peek() == '[') st.pop();
            else if(current_char == ')' && !st.isEmpty() && st.peek() == '(') st.pop();
            else return false;
        }
        return st.isEmpty();
    }
}
