// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        int start = A[0];
        int end = 0;
        int res = -1;
        
        for(int i = 0; i < N; i++) {
            start = Math.max(start, A[i]);
            end += A[i];
        }
        
        while(start <= end) {
            int mid = start + (end - start)/2;
            
            if(isValid(A, N, mid, M)) {
                res = mid;
                end = mid-1;
            } 
            else
                start = mid+1;
        }
        return res;
    }
    
    private static boolean isValid(int[] A, int N, int max, int M) {
        int student = 1;
        int sum = 0;
        
        for(int i = 0; i < N; i++) {
            sum += A[i];
            if(sum > max) {
                student++;
                sum = A[i];
            }
            
            if(student > M)
                return false;
        }
        return true;
    }
};