class Solution {
    public String longestDupSubstring(String s) {
        String ans = "";
        
        int left = 1, right = s.length()-1;
        
        while(left <= right) {
            int m = left + (right - left)/2;
            String duplicate = getDuplicate(m, s);
            if(duplicate != null) {
                ans = duplicate;
                left = m + 1;
            } else
                right = m - 1;
        }
        
        return ans;
    }
    
    private String getDuplicate(int size, String s) {
        long H = hash(s.substring(0,size));
        
        HashSet set = new HashSet();
        set.add(H);
        
        long pow = 1;
        
        for(int i = 1; i < size; i++)
            pow = (pow * 31);
        
        int n = s.length();
        
        for(int i = size; i < n; i++) {
            H = nextHash(pow, H, s.charAt(i-size), s.charAt(i));
            if(!set.add(H))
                return s.substring(i-size+1, i+1);
        }
        
        return null;
    }
    
    private long hash(String str) {
        long h = 0, p = 1;
        
        int n = str.length();
        
        for(int i = n; i >= 1; i--) {
            char ch = str.charAt(i-1);
            h += (ch - 'a' + 1) * p;
            p = (p*31);
        }
        
        return h;
    }
    
    private long nextHash(long pow, long hash, char left, char right) {
        return (hash-(left-'a'+1)*pow)*31+(right-'a'+1);
    }
}