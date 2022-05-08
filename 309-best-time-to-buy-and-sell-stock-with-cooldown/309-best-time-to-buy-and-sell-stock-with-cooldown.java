class Solution {
    public int maxProfit(int[] prices) {
        boolean buy = false;
        Map<String, Integer> mp = new HashMap<>();
        return helper(prices, 0, mp, true);
    }
    
    private int helper(int[] prices, int index, Map<String, Integer> mp, boolean buying) {
        if(index >= prices.length)
            return 0;
        if(mp.containsKey("("+index+","+buying+")"))
            return mp.get("("+index+","+buying +")");
        int cooldown = helper(prices, index+1, mp, buying);
        if(buying) {
            int buy = helper(prices, index+1, mp, !buying) - prices[index];
            mp.put("("+index+","+buying +")", Math.max(cooldown, buy));
        } else {
            int sell = helper(prices, index+2, mp, !buying) + prices[index];
            mp.put("("+index+","+buying +")", Math.max(cooldown, sell));
        }
        return mp.get("("+index+","+buying +")");
    }
}