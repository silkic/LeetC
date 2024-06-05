class Solution {
    public List<String> commonChars(String[] words) {
        List<String> str = new ArrayList<>();
       if(words.length == 0){
        return str;
       }
       int minfreq[] = new int[26];
       for(int i = 0; i < 26; i++){
        minfreq[i] = Integer.MAX_VALUE;
       }
       for(String word : words){
        int freq[] = new int[26];
        for(char c : word.toCharArray()){
            freq[c-'a']++;
        }
        for(int i = 0; i < 26; i++){
            minfreq[i] = Math.min(minfreq[i],freq[i]);
        }
       }
       for(int i = 0 ; i < 26; i++){
        while(minfreq[i] > 0){
            str.add(Character.toString((char)(i+'a')));
            minfreq[i]--;
        }
       }
       return str;
    }
}