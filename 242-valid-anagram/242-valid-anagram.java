class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] mp = new int[128];
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            mp[c]++;
        }
        
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            mp[c]--;
        }
        for(int num:mp) {
            if(num != 0)
                return false;
        }
        return true;
    }
}