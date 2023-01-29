class Solution {
    public static int solve(int a, int b) {
        if(a==b)
            return 0;
        int k=(a&b);
        if(k==a || k==b)
            return 1;
        return 2;
    }
}