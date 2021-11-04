class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        
        do {
            slow = findSum(slow);
            fast = findSum(findSum(fast));
        } while(slow != fast);
        
        return slow == 1;
    }
    
    private int findSum(int n) {
        int sum = 0, digit;
        
        while(n > 0) {
            digit = n % 10;
            sum += (digit*digit);
            n /= 10;
        }
        
        return sum;
    }
}