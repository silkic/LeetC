class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.length() == 1) {
            return s;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
           if (!st.isEmpty() && 
    (Character.toLowerCase(st.peek()) == Character.toLowerCase(s.charAt(i))) &&
    (Character.isLowerCase(st.peek()) && Character.isUpperCase(s.charAt(i)) ||
     Character.isUpperCase(st.peek()) && Character.isLowerCase(s.charAt(i))))  {
                st.pop();
            }
            else{
            st.push(s.charAt(i));}
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}