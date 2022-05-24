class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<String, List<String>> graph = new HashMap<>();
        wordList.add(0, beginWord);
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                String s1 = wordList.get(i);
                String s2 = wordList.get(j);
                if (differByOne(s1, s2)) {
                    List<String> arr1 = graph.getOrDefault(s1, new ArrayList<>());
                    arr1.add(s2);
                    List<String> arr2 = graph.getOrDefault(s2, new ArrayList<>());
                    arr2.add(s1);
                    graph.put(s1, arr1);
                    graph.put(s2, arr2);
                }
            }
        }
        if (!graph.containsKey(endWord)) return 0;

        Queue<String> q = new LinkedList<>();
//        for (int i = 0; i < wordList.size(); i++) {
//            if (differByOne(wordList.get(i), beginWord))
//                q.offer(wordList.get(i));
//        }
        q.offer(beginWord);

        if (q.size() == 0) return 0;
        Set<String> visited = new HashSet<>();
        int pathSize = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            pathSize++;
            for (int i = 0; i < size; i++) {
                String s1 = q.poll();
                visited.add(s1);
                if (s1.equals(endWord))
                    return pathSize;
                for (String s : graph.get(s1)) {
                    if (!visited.contains(s))
                        q.offer(s);
                }
            }

        }

        return 0;
    }

    private boolean differByOne(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        int n = word1.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                count++;
                if (count > 1)
                    return false;
            }
        }
        return count == 1;
    }
}
