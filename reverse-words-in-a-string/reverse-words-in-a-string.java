class Solution {
    public String reverseWords(String s) {
        String t = s.trim();
        
        StringBuilder sb = new StringBuilder();
        int lastIndex = t.length();
        for(int i = t.length()-1; i >= 0 ; i--) {
            char ch = t.charAt(i);
            if(ch == ' ') {
                
                sb.append(t.substring(i+1, lastIndex));
                sb.append(" ");
                while(t.charAt(i-1) == ' ')
                    i--;
                lastIndex = i;
            }
        }
        sb.append(t.substring(0,lastIndex));
        return sb.toString();
    }
}