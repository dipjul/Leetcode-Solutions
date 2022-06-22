class Solution {
    public int longestSubsequence(String s, int k) {
        int len = 0, sz = 0;
        Set<Integer> st = new TreeSet<>();
        int[] arr;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0')
                len++;
            else
                sz++;
        }
        if(sz == 0)
            return len;
        arr = new int[sz];
        int ind = 0;
        for(int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == '1')
                arr[ind++] = s.length()-1-i;
        }
        int num = 0;
        int ans = len;
        int j = 0;
        while(num <= k && j < arr.length) {
            num += (Math.pow(2, arr[j++]));
            if(num <= k)
                ans++;
        }
        return ans;
    }
}