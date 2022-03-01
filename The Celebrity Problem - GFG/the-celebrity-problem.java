// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution
{ 
    boolean knows(int a, int b, int[][] M) {
        if(M[a][b] == 1)
            return true;
        return false;
    }
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> st = new Stack<>();
    	
    	for(int i = 0; i < n; i++) {
    	    st.push(i);
    	}
    	
    	while(st.size() > 1) {
    	    int a = st.pop();
    	    int b = st.pop();
    	    
    	    if(knows(a, b, M)) {
    	        st.push(b);
    	    } else {
    	        st.push(a);
    	    }
    	}
    	
    	int candidate = st.peek();
    	boolean zeroRows = false;
    	int rowCount = 0;
    	for(int i = 0; i < n; i++) {
    	    if(M[candidate][i] == 0)
    	        rowCount++;
    	}
    	if(rowCount == n)
    	    zeroRows = true;
    	
    	boolean cols = false;
    	int colCount = 0;
    	for(int i = 0; i < n; i++) {
    	    if(M[i][candidate] == 1)
    	        colCount++;
    	}
    	if(colCount == n-1)
    	    cols = true;
    	if(zeroRows && cols)
    	    return candidate;
    	return -1;
    }
}