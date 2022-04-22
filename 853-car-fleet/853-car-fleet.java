class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length, res = 0;
        double[][] cars = new double[n][2];
        
        for(int i = 0; i < n; i++) {
            cars[i] = new double[] {position[i], (double)(target-position[i])/speed[i]};
        }
        Arrays.sort(cars, (a, b) -> Double.compare(a[0], b[0]));
        double curr = 0;
        for(int i = n-1; i >= 0; i--) {
            if(cars[i][1] > curr) {
                curr = cars[i][1];
                res++;
            }
        }
        return res;
    }
}
