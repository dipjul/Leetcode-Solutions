class Solution {
    public int longestValidParentheses(String s) {
        int left = 0, right = 0, maxlength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * right);
            } else if (right >= left) {
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * right);
            } else if (left >= right) {
                left = right = 0;
            }
        }
        return maxlength;
    }
    
    // TLE
    public int longestValidParentheses2(String s) {
        if(isValid(s))
            return s.length();
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i+2; j <= s.length(); j+=2) {
                if(isValid(s.substring(i, j)))
                    max = Math.max(max, j-i);
            }
        }
        return max;
    }
    
    private boolean isValid(String s) {
        int count = 0;
        for(char c : s.toCharArray()) {
            if(c == '(')
                count++;
            else
                count--;
            if(count < 0)
                return false;
        }
        return count == 0;
    }
}