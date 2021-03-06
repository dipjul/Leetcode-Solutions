class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();
        for (String str : strs) {
            char[] hash = new char[26];
            for(char ch : str.toCharArray())
                hash[ch-'a']++;
            String r = new String(hash);
            if (!mp.containsKey(r))
                mp.put(r, new ArrayList<String>());
            mp.get(r).add(str);
        }
        
        return new ArrayList<>(mp.values());
    }
    /*
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();
        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String r = new String(c);
            if (!mp.containsKey(r))
                mp.put(r, new ArrayList<String>());
            mp.get(r).add(str);
        }
        for (String key : mp.keySet()) {
            res.add(mp.get(key));
        }

        return res;
    }*/
    
}