class Solution {
    public String addStrings(String num1, String num2) {
        
        if(num1 == null || num1.length() == 0) return num2;
        if(num2 == null || num2.length() == 0) return num1;
        
        int index1 = num1.length()-1;
        int index2 = num2.length()-1;
        
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        
        while(index1>=0|| index2>=0||carry == 1){
            int n1 = index1>=0?num1.charAt(index1)-'0':0;
            int n2 = index2>=0?num2.charAt(index2)-'0':0;
            int res = (n1+n2+carry)%10;
            carry = (n1+n2+carry)/10;
            sb.insert(0,res);
            index1--;
            index2--;
            }
        return sb.toString();
    }
}