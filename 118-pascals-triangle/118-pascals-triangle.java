class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> row = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        row.add(1);
        ans.add(new ArrayList<>(row));
        if(numRows == 1)
            return ans;
        else {
            row.add(1);
            ans.add(new ArrayList<>(row));
            
            for(int i = 3; i <= numRows; i++) {
                row = getNthRow(i, row);
                ans.add(new ArrayList<>(row));
            }
            return ans;
        }
    }
    
    private List<Integer> getNthRow(int n, List<Integer> prevRow) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i = 1; i < n-1; i++)
            ans.add(prevRow.get(i-1)+prevRow.get(i));
        ans.add(1);
        return ans;
    }
}
    /*
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
*/