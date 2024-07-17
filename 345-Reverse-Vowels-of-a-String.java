class Solution {
    public String reverseVowels(String s) {
        String vowels = "AEIOUaeiou";
        char[] ch = s.toCharArray();
        int left = 0; 
        int right = s.length()-1;
       while(left < right){
           while(left < right && !vowels.contains(String.valueOf(ch[left]))){
            left++;
           }
           while(left < right && !vowels.contains(String.valueOf(ch[right]))){
            right--;
           }
           if(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
           }
        }
        return new String(ch);
    }
}