class Solution {
    public int search(int[] nums, int target) {
        int min = findMin(nums);
        int left = binarySearch(0, min - 1, nums, target);
        int right = binarySearch(min, nums.length - 1, nums, target);
        if (left != -1)
            return left;
        if (right != -1)
            return right;
        return -1;
    }

    private int findMin(int[] A) {
        int s = 0, e = A.length - 1, n = A.length;
        while (s <= e) {
            int m = s + (e - s) / 2;
            int prev = (m - 1 + n) % n, next = (m + 1) % n;
            if (A[m] <= A[prev] && A[m] <= A[next]) {
                return m;
            } else if (A[e] <= A[m])
                s = m + 1;
            else
                e = m - 1;
        }
        return -1;
    }

    private int binarySearch(int s, int e, int[] A, int target) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (A[mid] == target)
                return mid;
            else if (A[mid] < target)
                s = mid + 1;
            else
                e = mid - 1;
        }
        return -1;
    }
}