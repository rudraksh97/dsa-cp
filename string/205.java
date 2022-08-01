package string;

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Character> mapf = new HashMap<>();
        HashMap<Character, Character> mapb = new HashMap<>();

        char ss;
        char tt;
        
        for (int i=0; i<s.length(); i++) {
            ss = s.charAt(i);
            tt = t.charAt(i);
            
            if (mapf.containsKey(ss)) {
                char valf = mapf.get(ss);
                if (valf != tt) {
                    return false;
                }
            }
            
            else {
                mapf.put(ss, tt);
            }

            if (mapb.containsKey(tt)) {
                char valb = mapb.get(tt);
                if (valb != ss) {
                    return false;
                }
            }
            
            else {
                mapb.put(tt, ss);
            }
        }
        
        return true;
        
        
    }
}