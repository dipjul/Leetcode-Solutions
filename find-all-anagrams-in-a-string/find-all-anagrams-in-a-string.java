class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> pmap = new HashMap<>();
        Map<Character, Integer> smap = new HashMap<>();
        if (s.length() == 0 || p.length() == 0 || s.length() < p.length()) {
            return result;
        }
        int start = 0;
        for(int i=0;i<p.length();i++) {
            char ch = p.charAt(i);
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);
        }
        for(int i=0;i<p.length();i++) {
            char ch = s.charAt(i);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);
        }
        
        for(int i=p.length();i<s.length();i++) {
            if(smap.equals(pmap)){
                result.add(start);
            } 
            char cha = s.charAt(i);
            smap.put(cha, smap.getOrDefault(cha,0)+1);
            char chr = s.charAt(start);
            if(smap.get(chr) == 1)
                smap.remove(chr);
            else
                smap.put(chr, smap.get(chr)-1);
            start++;  
        }
        if(smap.equals(pmap))
            result.add(start);
        return result;
    }
}