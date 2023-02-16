class Solution {
    static int[] dp;
    public static int goodStones(int n, int[] arr) {
        // code here
        dp = new int[n];
        Arrays.fill(dp,-1);
        
        for(int i=0;i<n;i++)
            numOfWays(i,arr);
        int ans = 0;
        for(int i=0;i<n;i++)
            if(dp[i]>0)
                ans+=dp[i];
        return ans;
    }
    
    static int numOfWays(int curr,int[] arr){
        if(curr<0 || curr>=arr.length) 
            return 1;
        else if(dp[curr]>=0) 
            return dp[curr];
        
        dp[curr]=0;
        dp[curr]+=numOfWays(curr+arr[curr],arr);
        return dp[curr];
    }
}
        