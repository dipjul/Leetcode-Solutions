public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1; // check whether the bit is set or not
            res = res | (bit << (31 - i)); // put the bit at 31 - i th position i.e, reverse
        }
        return res;
    }
}