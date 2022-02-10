class Solution {
    
/*
Intuition:

    1. Use in-degree to find the courses to start with. i.e. Courses with no prerequisite will be added first in the pool(in-degree == 0) and set completionTime = time[currentCourse].
    2. After completing a course, we update prerequisite courses remaining i.e. decrement (indegree[currentCourse]) and update next course.
        completionTime[nextCourse] = max(completionTime[nextCourse], completionTime[prevCourse] + time[nextCourse])
    3. If all prerequisite are complete(indegree == 0) we add it to queue
    4. After visiting all courses we take maximum of completionTime from all courses. 
*/
    public int minimumTime(int n, int[][] relations, int[] time) {
        List<Integer>[] adj = new ArrayList[n];
        int[] indeg = new int[n];
        int[] completionTime = new int[n];
        
        for(int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
            indeg[i] = 0;
        }
        
        for(int[] edge:relations) {
            int start = edge[0]-1, end = edge[1]-1;
            adj[start].add(end);
            indeg[end]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            if(indeg[i] == 0) {
                q.offer(i);
                completionTime[i] = time[i];
            }
        }
        
        
        while(!q.isEmpty()) {
            int vertex = q.poll();
            for(int next:adj[vertex]) {
                completionTime[next] = Math.max(time[next] + completionTime[vertex], completionTime[next]);
                indeg[next]--;
                if(indeg[next] == 0)
                    q.offer(next);
            }         
        }
        int totalTime = 0;
        for(int t:completionTime)
            totalTime = Math.max(t, totalTime);
        return totalTime;
    }
}
