class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1,"I");
        mp.put(4,"IV");
        mp.put(5,"V");
        mp.put(9,"IX");
        mp.put(10,"X");
        mp.put(40, "XL");
        mp.put(50, "L");
        mp.put(90,"XC");
        mp.put(100,"C");
        mp.put(400,"CD");
        mp.put(500,"D");
        mp.put(900, "CM");
        mp.put(1000, "M");
        
        StringBuilder sb = new StringBuilder();
        while(num > 0) {
            if(num >= 1000) {
                num -= 1000;
                sb.append(mp.get(1000));
            } else if(num >= 900) {
                num -= 900;
                sb.append(mp.get(900));
            } else if(num >= 500) {
                num -= 500;
                sb.append(mp.get(500));
            } else if(num >= 400) {
                num -= 400;
                sb.append(mp.get(400));
            } else if(num >= 100) {
                num -= 100;
                sb.append(mp.get(100));
            } else if(num >= 90) {
                num -= 90;
                sb.append(mp.get(90));
            } else if(num >= 50) {
                num -= 50;
                sb.append(mp.get(50));
            } else if(num >= 40) {
                num -= 40;
                sb.append(mp.get(40));
            } else if(num >= 10) {
                num -= 10;
                sb.append(mp.get(10));
            } else if(num >= 9) {
                num -= 9;
                sb.append(mp.get(9));
            } else if(num >= 5) {
                num -= 5;
                sb.append(mp.get(5));
            } else if(num >= 4) {
                num -= 4;
                sb.append( mp.get(4));
            } else {
                num -= 1;
                sb.append(mp.get(1));
            }
        }
        
        return sb.toString();
    }
}
