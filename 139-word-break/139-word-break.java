class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        Map<String, Boolean> map = new HashMap<>();
        return helper(s, set, map);
    }
    
    private boolean helper(String s, Set<String> set, Map<String, Boolean> map) {
        if(s.length() == 0)
            return true;
        if(map.containsKey(s))
            return map.get(s);
        for(int i = 0; i < s.length(); i++) {
            String sub = s.substring(0, i+1);
            if(set.contains(sub)) {
                if(helper(s.substring(i+1), set, map)) {
                    map.put(s.substring(i+1), true);
                    return true;
               
                }
            }
        }
        map.put(s, false);
        return false;
    }
}