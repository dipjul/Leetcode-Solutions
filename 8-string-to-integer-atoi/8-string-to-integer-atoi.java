class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() <= 0)
            return 0;
        if(!isValid(s.charAt(0)))
            return 0;
        boolean neg = false;
        if(s.charAt(0) == '+' || s.charAt(0) == '-') {
            neg = s.charAt(0) == '-';
            s = s.substring(1);
        }
        long result = 0;
        for(int i = 0; i < s.length(); i++) {
            if(isDigit(s.charAt(i))) {
                if (
                    (result > Integer.MAX_VALUE / 10) || 
                    (result == Integer.MAX_VALUE / 10 && s.charAt(i)-'0' > Integer.MAX_VALUE % 10)) 
                {     
                    // If integer overflowed return 2^31-1, otherwise if underflowed return -2^31.    
                    return neg ? Integer.MIN_VALUE:Integer.MAX_VALUE;
                }
                result = result * 10 + s.charAt(i)-'0';
            } else {
                break;
            }
        }
        if(neg) {
            result = result*-1;
        }
        if(result > Integer.MAX_VALUE)
            result = Integer.MAX_VALUE;
        if(result < Integer.MIN_VALUE)
            result = Integer.MIN_VALUE;
        return (int)(result);
    }
    
    private boolean isDigit(char c) {
        if(c-'0' >= 0 && c-'0'<= 9)
            return true;
        return false;
    }
    
    private boolean isValid(char c) {
        if((c-'0' >= 0 && c-'0'<= 9) || c == '-' || c == '+')
            return true;
        return false;
    }
}