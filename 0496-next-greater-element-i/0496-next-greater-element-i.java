class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Map<Integer,Integer> mp = new HashMap<>();
       Stack<Integer> st = new Stack<>();
       for(int num : nums2){
          while(!st.isEmpty() && st.peek() < num){
            mp.put(st.pop(),num);
          }
       }
       int res[] = new int[nums1.length];
       for(int i = 0;i < res.length;i++){
        res[i] = mp.getOrDefault(nums1[i],-1);
       }
       return res;
    }
}