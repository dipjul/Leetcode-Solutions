class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> tmp = new ArrayList();
        tmp.add(1);
        result.add(tmp);
        if(numRows == 1) {
            return result;
        }
        else {
            List<Integer> arr = new ArrayList<>();
            arr.add(1);
            arr.add(1);
            result.add(arr);
            
            for(int i = 3; i <= numRows; i++) {
                arr = getNthRow(arr, i);
                result.add(arr);
            }
            return result;
        }
    }
    
    private List<Integer> getNthRow(List<Integer> arr, int n) {
        List<Integer> tmp = new ArrayList(n);
        tmp.add(1);
        for(int i = 1; i < n-1; i++)
            tmp.add(arr.get(i-1)+arr.get(i));
        tmp.add(1);
        return tmp;
    }
}