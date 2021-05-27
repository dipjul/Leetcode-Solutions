class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> big = new ArrayList<List<Integer>>();
        subsets(nums, 0, new ArrayList<Integer>() ,big);
        return big;
    }
    
    private void subsets(int[] arr, int vInd, ArrayList<Integer> temp, ArrayList<List<Integer>> big) {
        
        if(vInd >= arr.length) {
            big.add(new ArrayList<Integer>(temp));
            return;
        }
        temp.add(arr[vInd]);
        subsets(arr, vInd+1, temp, big);
        temp.remove(temp.size()-1);
        subsets(arr, vInd+1, temp, big);
    }
}