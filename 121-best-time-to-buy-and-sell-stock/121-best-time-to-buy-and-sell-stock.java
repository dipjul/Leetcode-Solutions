class Solution {
    public int maxProfit(int[] prices) {
        int smallTillNow = prices[0];
        int tmpProfit = 0;
        int maxProfit = 0;
        
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > smallTillNow) {
                tmpProfit = Math.max(tmpProfit, prices[i]-smallTillNow);
                maxProfit = Math.max(maxProfit, tmpProfit);
            }
            smallTillNow = Math.min(smallTillNow, prices[i]);
        }
        return maxProfit;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   /* 
    public int maxProfit(int[] prices) {
        int smallTillPrev = Integer.MAX_VALUE;
        int currentProfit = 0, maxProfit = 0;
        
        for(int i = 0; i < prices.length; i++) {
            if(smallTillPrev < prices[i])
                currentProfit = prices[i] - smallTillPrev;
            maxProfit = Math.max(maxProfit, currentProfit);
            smallTillPrev = Math.min(smallTillPrev, prices[i]);
        }
        return maxProfit;
    }
}
*/