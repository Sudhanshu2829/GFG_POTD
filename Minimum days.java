class Solution {
    public static int getMinimumDays(int N, String S, int[] P) {
        // code here
         int count=0;
        char[]arr=S.toCharArray();
        
        for(int i=0;i<N-1;i++)
        {
            while(arr[i+1]==arr[i] && arr[i]!='?')
                arr[P[count++]]='?';
        }
        return count;
    }
}
        