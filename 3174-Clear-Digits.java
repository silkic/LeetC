class Solution {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                if(str.length()>0&&Character.isLetter(str.charAt(str.length()-1))){
                    str.deleteCharAt(str.length()-1);
                }
            }
            else{
                str.append(c);
            }
        }
            return str.toString();
    }
}