class StockSpanner {
    List<Integer> arr;
    public StockSpanner() {
        arr = new ArrayList<Integer>();
    }
    
    public int next(int price) {
        arr.add(price);
        int count = 0;
        int i = arr.size()-1;
        while(i >= 0 && arr.get(i)<=price) {            
            count++;
            i--;
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */