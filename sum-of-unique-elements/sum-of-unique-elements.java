class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            if(!mp.containsKey(nums[i]))
                mp.put(nums[i],1);
            else
                mp.put(nums[i],mp.get(nums[i])+1);
        }
        for(int key:mp.keySet()) {
            if(mp.get(key) == 1)
                sum+=key;
        }
        return sum;
    }
}

class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int start = 1;
        if(n%2 == 0) {
            for(int i=n/2-1,j=n/2;i>=0;i--,j++) {
                res[i] = start++;
                res[j] = res[i]*-1;
            }
        } 
        else {
            res[n/2] = 0;
            for(int i=n/2-1,j=n/2+1;i>=0;i--,j++) {
                res[i] = start++;
                res[j] = res[i]*-1;
            }
        }
        return res;
    }
}

class Solution {
    public int sumOfUnique(int[] nums) {
        int[] arr = new int[101];
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            if(arr[nums[i]] == 0){
                arr[nums[i]] = 1;
                sum+=nums[i];
            }
            else{
                if(arr[nums[i]] == 1)
                    sum-=nums[i];
                arr[nums[i]] = 2;
                
            }
        }
        return sum;
    }
}
