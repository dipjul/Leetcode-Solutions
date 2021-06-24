class Solution {
    public int nextGreaterElement(int n) {
        
        char[] a = (n + "").toCharArray();

        int i, j;

        
        for(i = a.length-1; i>0;i--) {
            if(a[i]>a[i-1])
                break;
        }
        
        if(i == 0)
            return -1;
        
        int element = a[i-1], min = i;
        
        for(j = i + 1; j < a.length; j++) {
            if(a[j]>element && a[j] <= a[min]) {
                min = j;
            }
        }
        
        swap(a, i-1, min);
        Arrays.sort(a, i, a.length);
        
        long val = Long.parseLong(new String(a));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }
    
    public void swap(char[] a, int i, int j) {
        char tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}