class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ind = 0, sum = 0;
        int[] diff = new int[gas.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.value-a.value);
        for (int i = 0; i < gas.length; i++) {
            diff[i] = gas[i] - cost[i];
            sum += diff[i];
            if(diff[i]>=0)
                pq.offer(new Pair(diff[i], i));
        }
        if (sum < 0)
            return -1;
        
        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            if (p.value >= 0) {
                int pathSum = 0;
                ind = p.index;
                int j = p.index;
                do {
                    pathSum += diff[j];
                    if (pathSum < 0)
                        break;
                    j = (j + 1) % gas.length;
                } while(j != p.index);

                if (pathSum >= 0)
                    break;
            }
        }

        return ind;
    }
}

class Pair {
    int value;
    int index;
    
    Pair(int v, int i) {
        value = v;
        index = i;
    }
}

/*
[5,8,2,8] [6,5,6,6]
p [-1 2 -2 0]
s [0 1 -2 2]
Output: 3
dif = [-1 3 -4 2] < 0
[-1 2 -2 0]

[1,2,3,4,5]
[3,4,5,1,2]
p [-2 -4 -6 -3 0]
s [0 2 4 6 3]

dif = [-2 -2 -2 3 3] < 0
[-2-4 -6 -3 0]

[2,3,4]
[3,4,3]
diff =
*/

