class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(s, new ArrayList<>(), res);
        return res;
    }
    
    private void backtrack(String s, List<String> tmp, List<List<String>> res) {
        if(s == null || s.length() == 0) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        
        for(int i = 1; i <= s.length(); i++) {
            String subS = s.substring(0, i);
            if(!isPalindrome(subS))
                continue;
            tmp.add(subS);
            backtrack(s.substring(i), tmp, res);
            tmp.remove(tmp.size()-1);
        }
    }
    
    private boolean isPalindrome(String s) {
        int start = 0, end = s.length()-1;
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}