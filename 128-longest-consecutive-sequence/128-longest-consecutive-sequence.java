class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        
        for(int num:nums) {
            st.add(num);
        }
        int count = 0;
        for(int num:st) {
            if(!st.contains(num-1)) {
                int tmpCount = 1;
                int currNum = num;
                while(st.contains(currNum+1)) {
                    tmpCount++;
                    currNum++;;
                }
                count = Math.max(count, tmpCount);                 
            }
            
        }
        
        return count;
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        Set<Integer> set = new HashSet();
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        for(int num: set) {
            if(!set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;
                
                while(set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                
                max = Math.max(currentStreak, max);
            }
            
        }
        return max;
    }
}*/