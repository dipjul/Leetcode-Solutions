class Solution {
    public List<Integer> partitionLabels(String s) {
        int[][] mp = new int[26][2];
        for(int[] a: mp)
            Arrays.fill(a, -1);
        
        for(int i = 0; i < s.length(); i++) {
            if(mp[s.charAt(i)-'a'][0] == -1)
                mp[s.charAt(i)-'a'][0] = mp[s.charAt(i)-'a'][1] = i;
            else
                mp[s.charAt(i)-'a'][1] = i;
        }
        List<Integer> res = new ArrayList<>();
        int start = 0, end = 0, count = 0;
        for(int i = 0; i < s.length(); i++) {
            end = Math.max(end, mp[s.charAt(i)-'a'][1]);
            if(i == end) {
                res.add(end-start+1);
                start = i+1;   
            }
        }
        return res;
    }
}
/*
a -> f l
.
.
z -> f l
[][][]
*/