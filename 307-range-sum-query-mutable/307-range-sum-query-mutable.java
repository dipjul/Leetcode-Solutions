class FenwickTree {
    int[] ft, nums;

    private int LSOne(int n) {
        return (n & (-n));
    }

    public FenwickTree(int n, int[] nums) {
        ft = new int[n + 1];
        this.nums = nums;
        build(nums);
    }

    private void build(int[] nums) {
        for (int j = 0; j < nums.length; j++) {
            for (int i = j+1; i <= nums.length; i += LSOne(i)) {
                ft[i] += nums[j];
            }
        }
    }

    private int rsq(int i) {
        int sum = 0;
        for(;i>0;i-=LSOne(i))
            sum += ft[i];
        return sum;
    }

    public int sumRange(int i, int j) {
        return rsq(j+1)-rsq(i);
    }

    public void update(int ind, int val) {
        int tmp = nums[ind];
        nums[ind] = val;
        ind++;
        for(;ind<ft.length;ind+=LSOne(ind))
            ft[ind] += (val-tmp);
    }
}

class NumArray {
    FenwickTree ftree;
    public NumArray(int[] nums) {
        ftree = new FenwickTree(nums.length, nums);
    }

    public void update(int index, int val) {
        ftree.update(index, val);
    }

    public int sumRange(int left, int right) {
        return ftree.sumRange(left, right);
    }
}
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */