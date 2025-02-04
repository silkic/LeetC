class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
        String s = "";
        for (String n : arr) {
            s += n;
        }
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            st.push(c[i]-'0');
        }
        int i = 0;
        while (!st.isEmpty()) {
            if (c[i] == 'C') {
                st.pop();
            }
            if (c[i] == 'D') {
                st.push(st.peek() * 2);
            }
            if (c[i] == '+') {
                int top1 = st.pop();
                int top2 = st.peek();
                st.push(top1);
                st.push(top1 + top2);
            }
        }
    int sum = 0;
    for(int num:st)
    {
        sum += num;
    }return sum;
}}