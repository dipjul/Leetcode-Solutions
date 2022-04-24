class MedianFinder {
    int size;
    PriorityQueue<Integer> smallList;
    PriorityQueue<Integer> largeList;
    public MedianFinder() {
        smallList = new PriorityQueue<>(Collections.reverseOrder()); // maxHeap
        largeList = new PriorityQueue<>(); // minHeap
    }
    
    public void addNum(int num) {
        
        if(!smallList.isEmpty() && smallList.peek() <= num)
            largeList.add(num);
        else
            smallList.add(num);
        // size balance
        if(smallList.size() > largeList.size()+1) {
            int tmp = smallList.remove();
            largeList.add(tmp);
        } else if(smallList.size() < largeList.size()) {
            int tmp = largeList.remove();
            smallList.add(tmp);
        }
        size++;
    }
    
    public double findMedian() {

        if(size % 2 != 0) {
            return (double) smallList.peek();
        } else {
            return (double) (smallList.peek() + largeList.peek())/2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */