class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 400; i++)
            sb.append(0);
        num1 = reverse(num1);
        num2 = reverse(num2);
        if(num1.length() > num2.length()) {
            String tmp = num1;
            num1  = num2;
            num2 = tmp;
        }
        int carry = 0;
        int i = 0, j = 0;
        for (i = 0; i < num2.length(); i++) {
            carry = 0;
            for (j = 0; j < num1.length(); j++) {
                int a =  num2.charAt(i)-'0';
                int b = num1.charAt(j)-'0';
                int n = a * b + carry;
                int prev = sb.charAt(i+j)-'0';
                int sum = (prev + n) % 10;
                carry = (n+prev) / 10;
                sum +='0';
                sb.setCharAt(i + j, (char) sum);
            }
            sb.setCharAt(i+j, (char) (carry+'0'));
        }

        sb.setCharAt(i+j-1, (char) (carry+'0'));
        sb.reverse();
        int ind = 0;
        while(sb.length() > 0 && sb.charAt(ind) == '0')
            sb.deleteCharAt(ind);
        return sb.length() == 0?"0":sb.toString();
    }

    private String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
