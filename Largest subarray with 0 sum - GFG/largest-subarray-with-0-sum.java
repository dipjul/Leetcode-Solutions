// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        int sum = 0, len = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            
            if(sum == 0)
                len = Math.max(len, i+1);
            else if(mp.containsKey(sum))
                len = Math.max(len, i-mp.get(sum));
            else
                mp.put(sum, i);
        }
        return len;
        // int sum = 0,  currLen = 0;
        // Map<Integer, Integer> mp = new HashMap();
        // for(int i = 0; i < n; i++) {
        //     sum += arr[i];
        //     if(sum == 0) {
        //         currLen = Math.max(currLen, i + 1);
        //     }
        //     if(mp.containsKey(sum)) {
        //         currLen =  Math.max(currLen, i - mp.get(sum));
        //     }
            
        //     if(!mp.containsKey(sum))
        //         mp.put(sum, i);
        // }
        // return currLen;
    }
}






















/*

if(n == 0) return 0;
        HashMap<Integer,Integer> mp = new HashMap();
        int sum = 0;
        int largest = 0;
        for(int i=0;i<n;i++) {
            sum += arr[i];
            if(sum == 0) {
                largest = Math.max(largest, i+1);
            }
            if(mp.containsKey(sum)) {
                largest = Math.max(largest, i-mp.get(sum));
            }
            if(!mp.containsKey(sum))
                mp.put(sum, i);
        }
        return largest;

*/