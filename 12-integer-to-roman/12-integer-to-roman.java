class Solution {
    public String intToRoman(int num) {
        final String[] syms = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        final int[] vals = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(num > 0) {
            if(num - vals[i] >= 0) {
                num -= vals[i];
                sb.append(syms[i]);
            } else {
                i++;
            }
        }
        
        return sb.toString();
    }
}
