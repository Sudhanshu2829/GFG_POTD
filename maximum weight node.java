class Solution{
    public int maxWeightCell(int N, int Edge[]){
        int[] m=new int[N];
        int ans=0;
        for(int i=0;i<N;i++)
            m[i]=0;
        for(int j=0;j<N;j++)
        {
            if(Edge[j]>=0)
                m[Edge[j]]=m[Edge[j]]+j;
        }
        for(int k=0;k<N;k++)
        {
            if(m[k]>m[ans])
                ans=k;
        }
        return ans;
    }
}
