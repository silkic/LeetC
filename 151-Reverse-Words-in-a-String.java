class Solution {
    public String reverseWords(String s) {
        String str[] = s.trim().split(\\\\\s+\);
        StringBuilder op = new StringBuilder();
        String last = str[0];
        for(int i = str.length-1;i > 0; i--){
            op.append(str[i]+\ \);
        }
        return op.toString()+last;
    }
}