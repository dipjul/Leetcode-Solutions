// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    int sum = 0;
	    for(int i = 0; i < n; i++)
	        sum += arr[i];
	    Integer[][] memo = new Integer[n][sum+1];
	    return helper(arr, n, 0, 0, 0, memo);
	} 
	
	private int helper(int[] arr, int n, int index, int sum1, int sum2, Integer[][] memo) {
	    if(index == n)
	        return Math.abs(sum1 - sum2);
	   if(memo[index][sum1] != null)
	        return memo[index][sum1];
	   int diff1 = helper(arr, n, index+1, sum1+arr[index], sum2, memo);
	   int diff2 = helper(arr, n, index+1, sum1, sum2+arr[index], memo);
	   memo[index][sum1] = Math.min(diff1, diff2);
	   return memo[index][sum1];
	}
}
