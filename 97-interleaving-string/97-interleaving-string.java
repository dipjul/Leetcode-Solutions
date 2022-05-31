class Solution {
    Map<String, Boolean> mp;
    public boolean isInterleave(String s1, String s2, String s3) {
        mp = new HashMap<>();
        return backtrack(s1, s2, s3);
    }
    
    private boolean backtrack(String s1, String s2, String s3) {
        if(s3.length() == s1.length()+s2.length() && s3.length() == 0)
            return true;
        if(s3.length() != s1.length()+s2.length())
            return false;
        String key = s1.length()+","+s2.length()+","+s3.length();
        if(mp.containsKey(key))
            return mp.get(key);
        boolean b1 = false, b2 = false;
        
        if(s1.length() > 0 && s3.length() > 0 && s1.charAt(0) == s3.charAt(0))
            b1 = backtrack(s1.substring(1), s2, s3.substring(1));
        if(s2.length() > 0 && s3.length() > 0 && s2.charAt(0) == s3.charAt(0))
            b2 = backtrack(s1, s2.substring(1), s3.substring(1));
        boolean res = b1 || b2;
        mp.put(key, res);
        return mp.get(key);
    }
}
/*
s1.length, s2.length, s3.length -> value
*/