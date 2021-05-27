class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> big = new ArrayList();
        Arrays.sort(nums);
        sortSets(nums, 0, new ArrayList<Integer>(), big, true);
        return big;
    }
    
    public void sortSets(int[] arr, int vInd, ArrayList<Integer> temp, ArrayList<List<Integer>> big, boolean flag) {
        
        if(vInd == arr.length) {
            big.add(new ArrayList<Integer>(temp));
            return;
        }
        if(flag == false && arr[vInd]==arr[vInd-1]) {
            sortSets(arr, vInd + 1, temp, big, false);
        } else {
            temp.add(arr[vInd]);
            sortSets(arr, vInd + 1, temp, big, true); //include
            temp.remove(temp.size() - 1);
            sortSets(arr, vInd + 1, temp, big, false); //exclude
        }
    }
}