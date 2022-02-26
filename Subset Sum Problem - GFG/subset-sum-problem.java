// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        Boolean[][] memo = new Boolean[N][sum+1];
        return helper(arr, N, 0, sum, memo);
    }
    
    static Boolean helper(int arr[], int n, int index, int target, Boolean[][] memo) {
        if(target == 0)
            return true;
        if(index == n || target < 0)
            return false;
        if(memo[index][target] != null)
            return memo[index][target];
        memo[index][target] = helper(arr, n, index+1, target-arr[index], memo) || helper(arr, n, index+1, target, memo);
        return memo[index][target];
    }
}