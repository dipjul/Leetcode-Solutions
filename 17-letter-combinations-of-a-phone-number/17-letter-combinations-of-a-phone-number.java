class Solution {
    Map<Character, char[]> mp;
    public List<String> letterCombinations(String digits) {
        if(digits.equals(""))
            return new ArrayList<>();
        mp = new HashMap<>();
        mp.put('2', new char[]{'a', 'b', 'c'});
        mp.put('3', new char[]{'d', 'e', 'f'});
        mp.put('4', new char[]{'g', 'h', 'i'});
        mp.put('5', new char[]{'j', 'k', 'l'});
        mp.put('6', new char[]{'m', 'n', 'o'});
        mp.put('7', new char[]{'p', 'q', 'r', 's'});
        mp.put('8', new char[]{'t', 'u', 'v'});
        mp.put('9', new char[]{'w', 'x', 'y', 'z'});
        List<String> res = new ArrayList<>();
        recursive(digits, 0, "", res);
        return res;
    }
    
    private void recursive(String str, int i, String s, List<String> res) {
        if(i > str.length())
            return;
        if(i == str.length()) {
            res.add(s);
            return;
        }
        char chs[] = mp.get(str.charAt(i));
        for(int j = 0; j < chs.length; j++) {
            recursive(str, i+1, s+chs[j], res);
        }
        
    }
}