class Solution {
    public String maxValue(String n, int x) {
        if(n.charAt(0) == '-') {
            return handleNegative(n, x);
        }
        else {
            return handlePositive(n, x);
        }
    }
    
    private String handleNegative(String n, int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(n.charAt(0));
        int i = 1;
        while(i<n.length() && Character.getNumericValue(n.charAt(i))<=x) {
            sb.append(n.charAt(i));
            i++;
        }
        sb.append(x);
        while(i<n.length()) {
            sb.append(n.charAt(i));
            i++;
        }
        return sb.toString();
    }
    
    private String handlePositive(String n, int x) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<n.length() && Character.getNumericValue(n.charAt(i))>=x) {
            sb.append(n.charAt(i));
            i++;
        }
        sb.append(x);
        while(i<n.length()) {
            sb.append(n.charAt(i));
            i++;
        }
        return sb.toString();
    }
}