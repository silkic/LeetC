class Solution {
    public String removeKdigits(String num, int k) {
        if (k == 0)
            return num;
        if (k == num.length())
            return "0";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            while (!st.isEmpty() && k > 0 && st.peek() - '0' >= num.charAt(i) - '0') {
                st.pop();
                k -= 1;
            }
            st.push(num.charAt(i));
        }
        while (k > 0) {
            st.pop();
            k--;
        }
        if (st.isEmpty()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.peek());
            st.pop();
        }
        while (sb.length() != 0 && sb.charAt(sb.length() - 1) == '0') {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.reverse();
        if (sb.length() == 0) {
            return "0";
        }
        return sb.toString();
    }
}