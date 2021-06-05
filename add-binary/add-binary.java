class Solution {
    public String addBinary(String a, String b) {
        if(a == null || a.length() == 0) return b;
        if(b == null || b.length() == 0) return a;
        int index1 = a.length()-1;
        int index2 = b.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(index1 >= 0 || index2 >= 0 || carry == 1) {
            int num1 = index1 >= 0? a.charAt(index1) - '0':0;
            int num2 = index2 >= 0? b.charAt(index2) - '0':0;
            int res = (num1 + num2 + carry)% 2;
            carry = (num1 + num2 + carry)/2;
            sb.insert(0,res);
            index1--;
            index2--;
        }
        return sb.toString();
    }
}