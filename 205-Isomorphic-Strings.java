class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> map1= new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            // Check in map1
            if (map1.containsKey(charS)) {
                if (map1.get(charS) != charT) {
                    return false; // Conflict found
                }
            } 
            else 
            {
                map1.put(charS, charT); // Create mapping
            } 
            // Check in map2
            if (map2.containsKey(charT)) {
                if (map2.get(charT) != charS) {
                    return false; // Conflict found
                }
            } 
            else 
            {
                map2.put(charT, charS); // Create mapping
            }
        }
        
        return true;
    }
}