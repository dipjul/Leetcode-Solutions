// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
class Solution{
    public:
    int kthElement(int arr1[], int arr2[], int n, int m, int k)
    {
        int ptr1 = 0, ptr2 = 0;
        while(ptr1 < n && ptr2 < m) {
            if(arr1[ptr1] < arr2[ptr2]) {
                k--;
                if(k == 0)
                    return arr1[ptr1];
                ptr1++;
            } else {
                k--;
                if(k == 0)
                    return arr2[ptr2];
                ptr2++;
            }
        }
        
        while(k > 0 && ptr1 < n) {
            k--;
            if(k == 0)
                return arr1[ptr1];
            ptr1++;
        }
        while(k > 0 && ptr2 < m) {
            k--;
            if(k == 0)
                return arr2[ptr2];
            ptr2++;    
        }
        return -1;
    }
};

// { Driver Code Starts.
 
// Driver code
int main()
{
	int t;
	cin>>t;
	while(t--){
		int n,m,k;
		cin>>n>>m>>k;
		int arr1[n],arr2[m];
		for(int i=0;i<n;i++)
			cin>>arr1[i];
		for(int i=0;i<m;i++)
			cin>>arr2[i];
		
		Solution ob;
        cout << ob.kthElement(arr1, arr2, n, m, k)<<endl;
	}
    return 0;
}  // } Driver Code Ends