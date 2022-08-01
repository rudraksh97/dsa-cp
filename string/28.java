package string;

class Solution {
    public int strStr(String haystack, String needle) {
        int nlength = needle.length();
        
        if (nlength == 0) {
            return 0;
        }
        
        for (int i=0; i<haystack.length(); i++) {
            if (i+nlength > haystack.length()) {
                return -1;
            }            

            //interned pool problem, can't equate a substring and a string using ==, have to use equals
            if (haystack.substring(i, i+nlength).equals(needle)){
                return i;
            }
        }
        
        return -1;
    }
}