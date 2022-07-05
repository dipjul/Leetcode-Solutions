class Solution {
    public String minWindow(String s, String t) {
        int winS = 0, winE = 0;
        String ans = "";
        Map<Character, Integer> tMp = new HashMap<>();
        Map<Character, Integer> wMp = new HashMap<>();
        for(char c : t.toCharArray()) {
            tMp.put(c, tMp.getOrDefault(c, 0)+1);
        }
        while(winS < s.length() && winE < s.length()) {
            char c = s.charAt(winE);
            wMp.put(c, wMp.getOrDefault(c, 0)+1);
            while(winS <= winE && satisfy(wMp, tMp)) {
                if(ans == "")
                    ans = s.substring(winS, winE+1);
                ans = (winE-winS+1) < ans.length()?s.substring(winS, winE+1):ans;
                wMp.put(s.charAt(winS), wMp.get(s.charAt(winS))-1);
                if(wMp.get(s.charAt(winS)) == 0)
                    wMp.remove(s.charAt(winS));
                winS++;
            }
            winE++;
        }
        return ans;
    }

    private boolean satisfy(Map<Character, Integer> wMp, Map<Character, Integer> tMp) {
        for(char c : tMp.keySet()) {
            if(!wMp.containsKey(c) || wMp.get(c) < tMp.get(c))
                return false;
        }
        return true;
    }
}
/*
ADOBECODEBANC|

ABC

*/