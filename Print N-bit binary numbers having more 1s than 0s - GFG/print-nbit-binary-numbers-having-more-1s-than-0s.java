// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> NBitBinary(int N) {
        // code here
        int ones = 0, zeros = 0;
        String op = "";
        ArrayList<String> list = new ArrayList<>();
        solve(ones, zeros, N, op, list);
        return list;
    }
    
    void solve(int ones, int zeros, int n, String op, ArrayList<String> list) {
        if(n == 0) {
            list.add(op);
            return;
        }
        String op2 = op + "1";
        solve(ones+1, zeros, n-1, op2, list);
        if(zeros < ones) {
            String op1 = op + "0";
            solve(ones, zeros+1, n-1, op1, list);
        }
        
        return;
    }
}