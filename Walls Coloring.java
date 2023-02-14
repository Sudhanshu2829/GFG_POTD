class Solution 
{
	int minCost(int [][] colors, int N) {
	    
	    int pink = 0, black = 0, yellow = 0;
	    
	    for(int i=0; i<N; i++) 
	    {
	        int cp = Math.min(black, yellow) + colors[i][0];
	        int cb = Math.min(pink, yellow) + colors[i][1];
	        int cy = Math.min(pink, black) + colors[i][2];
	        
	        pink = cp; black = cb; yellow = cy;
	    }
	    
	    return Math.min(pink, Math.min(black, yellow));
    }
}