class Solution 
{
    public static int solve(int N, int K, int[] arr) 
    {
        int sum =0;
        for(int i=0;i<N;i++)
        {
            sum+=arr[i];
        }
        ArrayList<Integer> factors = new  ArrayList<>();
        for(int i = 1 ;i*i<=sum;i++)
        {
           if(sum%i==0)
           {
               factors.add(i);
               if( i!= sum/i)//36 i = 6
               factors.add(sum/i);
           }
        }
        Collections.sort(factors);
        for(int i = 1;i<N;i++)
        arr[i] = arr[i]+arr[i-1];
        int ans =1;
        for(int i=factors.size()-1 ;i>=0;i--)
        {
            int countofsub = 0 ;
         for(int j =0 ;j<N;j++)// pre sum array
         {
             if(arr[j]%factors.get(i)==0)
             countofsub++;
         }
         if(countofsub>=K)
         {
             ans = factors.get(i);
             break;
         }
         
         
        }
        
        return ans;
        
    }
}