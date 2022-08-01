package string;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int latest_index=0;
        char ss;
        int tlength = t.length();
        for (int j=0; j<s.length(); j++) {            
            ss = s.charAt(j);
            boolean flag = true;
            while(flag) {
                if (latest_index >= tlength) {
                    return false;
                }
                
                if (ss == t.charAt(latest_index)) {
                    flag = false;
                }
                
                latest_index+=1;
            }
        }
        
        return true;
    }
}