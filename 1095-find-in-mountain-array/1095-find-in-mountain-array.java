/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 /*
 Steps:
        1. Get the peak element index, using binarySearch - O(logn)
        2. Search element in the range [0, peakElement] sorted ascendingly, using binarySearch - O(logn)
        3. Search element in the range [peakElement+1,n] which is sorted descendingly, using binarySearch - O(logn)
        4. if present in [0, peakElement] then return, else check if present in [peakElement+1,n] return else return "-1" - O(logn)
    
    Time Complexity: O(logn)
    Space Complexity: O(1)
 */
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n =  mountainArr.length();
        int peakElement = findPeak(mountainArr, n);
        int left = binarySearch(mountainArr, target, 0, peakElement);
        int right = descBinarySearch(mountainArr, target, peakElement+1, mountainArr.length()-1);
        if(left != -1)
            return left;
        else if(right != -1)
            return right;
        
        return -1;
    }
    
	// BinarySearch on ascendingly sorted Array 
    private int binarySearch(MountainArray mountainArr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start)/2;
            int midElement = mountainArr.get(mid);
            if(midElement == target)
                return mid;
            else if(midElement < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
    
	// BinarySearch on descendingly sorted Array 
    private int descBinarySearch(MountainArray mountainArr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start)/2;
            int midElement = mountainArr.get(mid);
            if(midElement == target)
                return mid;
            else if(midElement < target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
    
	// Find the peak
    private int findPeak(MountainArray mountainArr, int n) {
        int start = 0, end = n - 1;
        
        while(start <= end) {
            int mid = start + (end - start)/2;
			
			// to reduce number of api calls
            int midElement = mountainArr.get(mid);
            int midElementLeft = mid-1>=0?mountainArr.get(mid-1):-1;   
            int midElementRight = mid+1<n?mountainArr.get(mid+1):-1; 
            if(mid > 0 && mid < n-1) {

                if(midElement>midElementRight && midElement>midElementLeft)
                    return mid;
                else if(midElementLeft>midElement)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else if(mid == 0) {
                if(midElement>midElementRight)
                    return mid;
                else
                    return mid+1;
            }
            else if(mid == n-1) {
                if(midElement>midElementLeft)
                    return mid;
                else
                    return mid-1;
            }
        }
        return -1;
    }
}