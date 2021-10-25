class Solution {
    public String minWindow(String str, String pattern) {
        int windowStart = 0, minLen = Integer.MAX_VALUE, matched = 0;
          Map<Character, Integer> charFreqMap = new HashMap<>();
            String res = "";
          for(char ch : pattern.toCharArray())
            charFreqMap.put(ch, charFreqMap.getOrDefault(ch, 0)+1);

          for(int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char right = str.charAt(windowEnd);

            if(charFreqMap.containsKey(right)) {
                charFreqMap.put(right, charFreqMap.get(right)-1);
                if(charFreqMap.get(right) == 0)
                    matched++;
            }

            while (matched == charFreqMap.size()) {
                if(minLen > windowEnd - windowStart + 1) {
                    minLen = windowEnd - windowStart + 1;
                    res = str.substring(windowStart, windowEnd+1);
                }

                char left = str.charAt(windowStart);
                if(charFreqMap.containsKey(left)) {
                    if(charFreqMap.get(left) == 0)
                        matched--;
                    charFreqMap.put(left, charFreqMap.get(left)+1);
                }
                windowStart++;
            }
          }
        return res;
    }
}