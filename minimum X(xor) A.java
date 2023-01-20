class Solution {
    public static int minVal(int a, int b) {
        int setBits = Integer.bitCount(b);
        int setBits1 = Integer.bitCount(a);
        int ans = 0;
        for (int i = 0; i <= 31; i++) {
            int mask = 1 << i;
            int set = a & mask;
            if (set == 0 && setBits > setBits1) {
                ans |= (mask);
                setBits--;
            } 
            else if (set != 0 && setBits1 > setBits) {
                setBits1--;
            } 
            else {
                ans |= set;
            }
        }
        return ans;
    }
}