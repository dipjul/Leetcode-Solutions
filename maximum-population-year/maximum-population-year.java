class Solution {
    public int maximumPopulation(int[][] logs) {
        int arr[] = new int[101], res = 0;
        for(var i:logs) {
            System.out.println(i[0]+" "+i[1]);
            ++arr[i[0]-1950];
            --arr[i[1]-1950];
        }
        for(int i = 1; i < 100; i++) {
            arr[i] += arr[i-1];
            res = arr[i] > arr[res] ? i : res;
        }
        return res+1950;
    }
}