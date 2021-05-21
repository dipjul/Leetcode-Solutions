class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minAbsDiff = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Set<Integer> st = new HashSet<Integer>();
        st.add(arr[0]);
        for(int i=1;i<arr.length;i++) {
            minAbsDiff = Math.min(minAbsDiff, arr[i]-arr[i-1]);
            st.add(arr[i]);
        }
        for(int i=1;i<arr.length;i++) {
            List<Integer> tmp = new ArrayList<>();
            if(st.contains(arr[i]-minAbsDiff)) {
                tmp.add(arr[i]-minAbsDiff);
                tmp.add(arr[i]);
                result.add(tmp);
            }
        }
    return result;
    }
}