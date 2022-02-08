class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<Boolean> result = new ArrayList<>();
        
        // initailize the graph
        int[] indegree = new int[numCourses];
        Map<Integer, Set<Integer>> adj = new HashMap<>();
        Map<Integer, Set<Integer>> prerequisitesMap = new HashMap<>();
        
        for(int i = 0; i < numCourses; i++) {
            prerequisitesMap.put(i, new HashSet<>());
            adj.put(i, new HashSet<>());            
        }

        // build the graph
        // indegree calculation & mapping the next nodes to the prev ones
        // start -> end1
        // start -> end2
        // <start:<end1, end2>>
        for(int i = 0; i < prerequisites.length; i++) {
            int start = prerequisites[i][0], end = prerequisites[i][1];
            indegree[end]++;
            adj.get(start).add(end);
        }
        
        // add the sources
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0)
                q.offer(i);
        }
        
        // build the complete prerequisitesMap
        while(!q.isEmpty()) {
            int node = q.poll();
            // for each next vertex, add the node to the prerequisitesMap of next & 
            // add all the prerequisitesMap of the node to the next
            // decrement the indegree, if any next with indegree 0 add it to source queue
            for(int next:adj.get(node)) {
                prerequisitesMap.get(next).add(node);
                prerequisitesMap.get(next).addAll(prerequisitesMap.get(node));
                indegree[next]--;
                if(indegree[next] == 0)
                    q.offer(next);
            }
        }

        // checking the condition
        for(int i = 0; i < queries.length; i++) {
            int prereq = queries[i][0], course = queries[i][1];
            if(prerequisitesMap.get(course).contains(prereq))
                result.add(true);
            else
                result.add(false);
        }
        
        return result;
    }
}

