class Solution {
    public int numberOfSubstrings(String s) {
        int cnt = 0;
        int occur[] = {-1,-1,-1};
        for(int i = 0; i < s.length();i++){
            occur[s.charAt(i)-'a'] = i;
            if(occur[0] != -1 && occur[1] != -1 && occur[1] != -1){
                cnt += Math.min(occur[0],Math.min(occur[1],occur[2]))+1;
            }
        }
        return cnt;
    }
}