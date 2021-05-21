class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minAbsDiff = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList();
        for(int i=0;i<arr.length-1;i++) {
            int diff = arr[i+1]-arr[i];
            if(diff < minAbsDiff) {
                minAbsDiff = diff;
                result.clear();
                result.add(Arrays.asList(arr[i],arr[i+1]));
            } else if(diff == minAbsDiff) {
                result.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        
    return result;
    }
}