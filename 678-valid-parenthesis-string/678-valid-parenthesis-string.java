class Solution {
    Boolean[][] dp;

    public boolean checkValidString(String s) {
        dp = new Boolean[s.length()][s.length()];
        return backtrack(s, 0, 0);
    }

    private boolean backtrack(String s, int index, int count) {
        if (count < 0 || (index >= s.length() && count > 0))
            return false;
        if (index >= s.length() && count == 0)
            return true;
        if (dp[index][count] != null)
            return dp[index][count];
        if (s.charAt(index) == '*') {
            dp[index][count] = (backtrack(s, index + 1, count + 1) ||
                    backtrack(s, index + 1, count - 1) ||
                    backtrack(s, index + 1, count));
        } else if (s.charAt(index) == '(') {
            dp[index][count] = backtrack(s, index + 1, count + 1);
        } else {
            dp[index][count] = backtrack(s, index + 1, count - 1);
        }
        return dp[index][count];
    }
}