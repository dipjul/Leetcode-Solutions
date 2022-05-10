class Solution {
    public int countSubstrings(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        for(int i = 0; i < s.length(); i++) {
            sb.append("#");
            sb.append(s.charAt(i));
        }
        sb.append("#");
        sb.append("@");
        int[] p = manacher_odd(sb.toString());
        int ans = 0;
        for(int i = 0; i < p.length; i++)
            ans += (p[i]+1)/2;
        return ans;
    }
    
    private int[] manacher_odd(String s) {
        int[] p = new int[s.length()];
        int center = 0, rightBoundary = 0;
        
        for(int i = 1; i < s.length()-1; i++) {
            
            int mirror = 2*center-i;
            if(i < rightBoundary)
                p[i] = Math.min(p[mirror], rightBoundary-i);
            
            while(s.charAt(i-(p[i]+1)) == s.charAt(i+(p[i]+1)))
                p[i]++;
            
            if(i + p[i] > rightBoundary) {
                center = i;
                rightBoundary = i + p[i];
            }
        }
        
        return p;
    }
}