class Solution {
    public long distinctNames(String[] ideas) {
        Set<String>[] setArr = new HashSet[26];
        for(int i = 0; i < 26; i++)
            setArr[i] = new HashSet<>();
        long ans = 0;
        for(String idea : ideas) {
            int pos = idea.charAt(0)-'a';
            setArr[pos].add(idea.substring(1));
        }
        
        for(int i = 0; i < 26; i++) {
            for(int j = i + 1; j < 26; j++) {
                if(setArr[i].size() == 0 || setArr[j].size() == 0)
                    continue;
                int count = commonCount(setArr[i], setArr[j]);
                ans += (2*(setArr[i].size()-count)*(setArr[j].size()-count));
            }
        }
        return ans;
    }
    
    private int commonCount(Set<String> s1, Set<String> s2) {
        if(s2.size() < s1.size())
            return commonCount(s2, s1);
        int count = 0;
        for(String s : s1) {
            if(s2.contains(s))
                count++;
        }
        return count;
    }
}