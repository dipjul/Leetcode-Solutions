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
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    // } Driver Code Ends


class Solution{

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    Arrays.sort(arr);
	    Integer[][] memo = new Integer[n][sum+1];
	    return helper(arr, n, 0, sum, memo);
	} 
	
	private int helper(int[] arr, int n, int index, int sum, Integer[][] memo) {
	    if(sum == 0)
	       return 1;
	    if(index >= n)
	       return 0;
	    int cnt1 = 0;
	    if(memo[index][sum] == null) {
              if (arr[index] <= sum) {
                cnt1 = helper(arr, n, index+1, sum-arr[index], memo)%1000000007;
              }

      // recursive call after excluding the number at the currentIndex
            int cnt2 = helper(arr, n, index+1, sum, memo)%1000000007;

            memo[index][sum] = (cnt1 + cnt2)%1000000007;
        }

        return memo[index][sum];
	}
	
}