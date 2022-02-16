// { Driver Code Starts

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int k = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.safePos(n,k));
        }
    }
}// } Driver Code Ends



class Solution {
    static int safePos(int n, int k) {
        // code here
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++)
            arr.add(i);
        k = k - 1;
        int index = 0;
        int[] res = new int[]{-1};
        solve(index, k, arr, res);
        return res[0];
    }
    
    static void solve(int index, int k, List<Integer> arr, int[] res) {
        if(arr.size()==1) {
            res[0] = arr.get(0);
            return;
        }
        index = (index + k)%arr.size();
        arr.remove(index);
        solve(index, k, arr, res);
    }
};