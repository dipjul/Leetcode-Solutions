class Solution {
    Map<String, Boolean> mp;
    public boolean isInterleave(String s1, String s2, String s3) {
        mp = new HashMap<>();
        return backtrack(s1, s2, s3);
    }
    
    private boolean backtrack(String s1, String s2, String s3) {
        int l1 = s1.length(), l2 = s2.length(), l3 = s3.length();
        if(l3 == l1+l2 && l3 == 0)
            return true;
        if(l3 != l1+l2)
            return false;
        String key = l1+","+l2+","+l3;
        if(mp.containsKey(key))
            return mp.get(key);
        boolean b1 = false, b2 = false;
        
        if(l1 > 0 && l3 > 0 && s1.charAt(0) == s3.charAt(0))
            b1 = backtrack(s1.substring(1), s2, s3.substring(1));
        if(l2 > 0 && l3 > 0 && s2.charAt(0) == s3.charAt(0))
            b2 = backtrack(s1, s2.substring(1), s3.substring(1));
        boolean res = b1 || b2;
        mp.put(key, res);
        return mp.get(key);
    }
}
