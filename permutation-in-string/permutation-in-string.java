class Solution {
    public boolean checkInclusion(String s1, String s2) {
        for(int i = s1.length()-1, j = 0; i < s2.length(); i++, j++) {
            String s = s2.substring(j, i+1);
            if(isPermutation(s1, s))
                return true;
        }
        return false;
    }
    
    private boolean isPermutation(String s1, String subString) {
      HashMap<Character, Integer> mp = new HashMap<>();

      for(char c:s1.toCharArray())
        mp.put(c, mp.getOrDefault(c, 0)+1);
    
        for(char c:subString.toCharArray()) {
            if(!mp.containsKey(c))
                return false;
            mp.put(c, mp.get(c)-1);
            if(mp.get(c) == 0)
                mp.remove(c);
        }
        return mp.size() == 0;
  }
}