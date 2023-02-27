class Solution {
    public long[] optimalArray(int n,int arr[])
    {
        long ans[] = new long[n];
        long sum = arr[0];
        for(int i = 1 ; i< n ; i++){
            int ind = i/2;
            ans[i] = arr[i] - arr[ind] + ans[i-1];
        }
        return ans ;
    }
}