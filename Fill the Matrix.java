class Solution
{
	public static int minIteration(int N, int M, int x, int y){
		//code here
		
		if(N == 1 && M == 1)return 0; 
		
		int ans = 0;
		
		int X = x-1 , Y = y -1;
		
		//top left 
		ans = Math.max(ans , X+Y );
		//bottom left
		ans = Math.max(ans , (N-(X+1))+Y);
		//top right
		ans = Math.max(ans , X + (M-(Y+1)) );
		// bottom right
		ans = Math.max(ans,(N-(X+1))+(M-(Y+1)) );
		
		return ans;
		
	}
}