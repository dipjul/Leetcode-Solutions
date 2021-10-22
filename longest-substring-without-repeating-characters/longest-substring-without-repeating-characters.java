class Solution {
    public int lengthOfLongestSubstring(String s) {
        int wS = 0, maxLen = 0;
        HashMap<Character, Integer> mp = new HashMap();
        
        for(int wE = 0; wE < s.length(); wE++) {
            char right = s.charAt(wE);
            if(mp.containsKey(right)) {
                wS = Math.max(wS, mp.get(right)+1);
            }
            mp.put(right, wE);
            maxLen = Math.max(maxLen, wE- wS + 1);
        }
        return maxLen;
    }
}