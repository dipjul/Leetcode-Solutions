class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int j = 0;
        QueueWithMax q = new QueueWithMax();
        for(int i = 0;i<k;i++) {
            q.enque(nums[i]);
        }
        result[j++] = q.findMax();
        for(int i=k;i<nums.length;i++) {
                q.deque();
                q.enque(nums[i]);
                result[j++] = q.findMax();
        }
        return result;
    }
}

class QueueWithMax {
    Queue<Integer> main;
    Deque<Integer> max;
    
    QueueWithMax() {
        main = new LinkedList<>();
        max = new LinkedList<>();
    }
    
    public void enque(int item) {
        main.add(item);
        while(!max.isEmpty() && max.getLast() < item)
            max.removeLast();
        max.add(item);
    }
    
    public int deque() {
        int num = main.remove();
        if(max.getFirst() == num)
            max.remove();
        return num;
    }
    
    public int findMax() {
        return max.getFirst();
    }
}