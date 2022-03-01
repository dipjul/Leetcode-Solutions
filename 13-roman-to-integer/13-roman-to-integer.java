class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        Map<Character, Integer> map = new  HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        result += map.get(s.charAt(n-1));
        for(int i = n-2; i >= 0; i--) {
            char ch = s.charAt(i);
            char nextCh = s.charAt(i+1);
            if(map.get(ch) < map.get(nextCh)) {
                result -= map.get(ch);
            } else {
                result += map.get(ch);
            }
        }
        
        return result;
    }
}