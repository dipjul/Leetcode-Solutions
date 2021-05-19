class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length) return false;
        int map[] = new int[1001];
        for(int i=0;i<target.length;i++) {
            map[target[i]]++;
            map[arr[i]]--;
        }
        for(int i=0;i<map.length;i++) {
            if(map[i] != 0)
                return false;
        }
        return true;
    }
}