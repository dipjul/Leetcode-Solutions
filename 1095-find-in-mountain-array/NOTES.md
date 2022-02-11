Steps:
​
1. Get the peak element index, using binarySearch - O(logn)
1. Search element in the range [0, peakElement] sorted ascendingly, using binarySearch - O(logn)
Search element in the range [peakElement+1,n] which is sorted descendingly, using binarySearch - O(logn)
if present in [0, peakElement] then return, else check if present in [peakElement+1,n] return else return "-1" - O(logn)
Time Complexity: O(logn)
Space Complexity: O(1)