class Solution {
    // public static int sum = 0;
    public int countVowelStrings(int n) {
        return countVowelStrings(n,0);
    }
    
    private int countVowelStrings(int n, int k) {
        if(n == 0) return 1;
        if(k == 5) return 0;
        return countVowelStrings(n, k+1) + countVowelStrings(n-1, k);
    }
}