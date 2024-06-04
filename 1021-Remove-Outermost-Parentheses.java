class Solution {
    public String removeOuterParentheses(String s) {
        if(s == ""){
            return s;
        }
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder(s);
        int count = 0;
        for(int i =0 ; i<s.length(); i++){
            if(str2.charAt(i) == '('){
                if(count > 0){
                    str1.append("(");
                }
                count++;
            }
            else if(str2.charAt(i) == ')'){
                count--;
                if(count > 0){
                    str1.append(")");
                }
            }
    }
    return str1.toString();
}
}