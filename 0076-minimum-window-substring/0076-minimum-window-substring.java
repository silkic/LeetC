class Solution {
    public String minWindow(String s, String t) {
       int minlen = Integer.MAX_VALUE;
       int l = 0;
       int r = 0;
       int cnt = t.length();
       int sind = -1;
       int[] map = new int[128];
       for(char c : t.toCharArray()){
           map[c]++;
       }
      char[] ch = s.toCharArray();
      while(r < ch.length){
        if(map[ch[r++]]-- > 0){
            cnt--;
        }
        while(cnt == 0){
            if(r-l < minlen){
                sind = l;
                minlen = r-l;
            }
            if(map[ch[l++]]++ == 0){
                cnt++;
            }
        }
      }
      return minlen == Integer.MAX_VALUE ? new String() : new String(ch,sind,minlen);
   }
}