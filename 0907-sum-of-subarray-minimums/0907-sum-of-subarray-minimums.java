class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod = 1000000007;
        Stack<Integer> st = new Stack<>();
        long sum = 0;
        for(int i = 0; i <= arr.length;i++){
            while(!st.isEmpty() && (i == arr.length || arr[st.peek()] >= arr[i]))
            {                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;
                long cnt = (mid-left) * (right-mid) % mod;
                sum += (cnt * arr[mid]) % mod;
                sum %= mod;
            }
            st.push(i);
        }
        return (int)sum;
    }
}