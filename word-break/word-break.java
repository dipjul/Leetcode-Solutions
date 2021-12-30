class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Map<String, Boolean> mp = new HashMap();
        Set<String> set = new HashSet(wordDict);
        return helper(s, set, mp);
    }
    
    public boolean helper(String s, Set<String> set, Map<String, Boolean> mp) {
        if(mp.containsKey(s))
            return mp.get(s);
        if(s.length() == 0) {
            mp.put(s, true);
            return true;
        }
            
        
        for(int i = 1; i <= s.length(); i++) {
            if(set.contains(s.substring(0, i)) && helper(s.substring(i), set, mp)) {
                mp.put(s.substring(i), true);
                return true;
            }
                
        }
        mp.put(s, false);
        return false;
    }
}