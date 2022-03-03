class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        int ptr1 = 0, ptr2 = 0;
        while(ptr1 < v1.length || ptr2 < v2.length) {
            int val1 = ptr1<v1.length?Integer.valueOf(v1[ptr1]):0;
            int val2 = ptr2<v2.length?Integer.valueOf(v2[ptr2]):0;
            if(val1 > val2)
                return 1;
            else if(val1 < val2)
                return -1;
            ptr1++;
            ptr2++;
        }
        return 0;
    }
}