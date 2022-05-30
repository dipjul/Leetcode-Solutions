class Solution {
    public String discountPrices(String sentence, int discount) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (i>0 && (ch == '$' && sentence.charAt(i-1) == ' ')
               || i == 0 && (ch == '$')) {
                sb.append(ch);
                String tmp = "";
                i++;
                while (i < sentence.length() && sentence.charAt(i) >= '0' && sentence.charAt(i) <= '9') {
                    tmp += sentence.charAt(i);
                    i++;
                }
                if (tmp.length() > 0 && (i == sentence.length() || sentence.charAt(i) == ' ')) {
                    double val = Double.parseDouble(tmp);
                    val = val - (1.0*discount / 100.0d) * val;
                    DecimalFormat df=new DecimalFormat("0.00");
                    String str = df.format(val);
                    sb.append(str);
                    if(i < sentence.length())
                        sb.append(sentence.charAt(i));
                } else {
                    sb.append(tmp);
                    if(i < sentence.length())
                        sb.append(sentence.charAt(i));
                }
            } else {
                sb.append(ch);
            }

        }
        return sb.toString();
    }
}