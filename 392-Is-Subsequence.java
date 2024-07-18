class Solution {
    public boolean isSubsequence(String s, String t) {
      if(s.length() > t.length()){
        return false;   
      }
      int i=0;
      int j =0;
      int tot = 0;
      while(i < s.length() && j < t.length()){
        if(s.charAt(i) == t.charAt(j)){
            tot++;
            i++;
            j++;
        }
        else{
            j++;
        }
      }
        return tot == s.length();
    }
}