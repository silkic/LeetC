class Solution {
    public int characterReplacement(String s, int k) {
        int maxlen = 0;
        int l = 0;
        int r = 0;
        int Acnt = 0;
        while (r < s.length()) {
            if (s.charAt(r) == 'A') {
                Acnt++;
            }
            if (Acnt > k) {
                if (s.charAt(l) == 'A') {
                    Acnt--;
                }
                l++;
            }
            if (Acnt <= k) {
                maxlen = Math.max(maxlen, r - l + 1);
            }
            r++;
        }
        return maxlen;
    }
}