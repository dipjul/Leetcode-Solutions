class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> freqCountMap = new HashMap();
        int wS = 0, matched = 0;
        
        for(char ch:s1.toCharArray())
            freqCountMap.put(ch, freqCountMap.getOrDefault(ch, 0)+1);
        
        for(int wE = 0; wE < s2.length(); wE++) {
            char right = s2.charAt(wE);
            if(freqCountMap.containsKey(right)) {
                freqCountMap.put(right, freqCountMap.get(right)-1);
                if(freqCountMap.get(right) == 0)
                    matched++;
            }
            if(freqCountMap.size() == matched)
                return true;
            if(wE >= s1.length()-1) {
                char left = s2.charAt(wS);
                if(freqCountMap.containsKey(left)) {
                    if(freqCountMap.get(left) == 0)
                        matched--;
                    freqCountMap.put(left, freqCountMap.get(left)+1);
                }
                wS++;
            }
        }
        return false;
    }
}