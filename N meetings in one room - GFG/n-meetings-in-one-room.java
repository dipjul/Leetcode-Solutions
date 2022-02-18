// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        
        Pair[] p = new Pair[n];
        for(int i = 0; i < n; i++) {
            p[i] = new Pair(start[i], end[i]);
        }
        
        Arrays.sort(p,new Comparator<Pair>(){
            public int compare(Pair a, Pair b) {
                return a.end-b.end;
            }
        });

        int prevStart = p[0].start, prevEnd = p[0].end;
        int count = 1;
        for(int i = 1; i < n; i++) {
            if(p[i].start > prevEnd) {
                count++;
                prevEnd = p[i].end;
            }
        }
        
        return count;
    }
}

class Pair {
    int start;
    int end;
    
    Pair(int s, int e) {
        start = s;
        end = e;
    }
}
