class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String str : strs) {
            char[] arr = new char[26];
            for(char c : str.toCharArray())
                arr[c-'a']++;
            
            String key = new String(arr);
            if(!mp.containsKey(key))
                mp.put(key, new ArrayList<>());
            mp.get(key).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}