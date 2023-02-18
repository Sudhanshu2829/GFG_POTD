class Solution{
    public static int appleSequence(int n, int m, String arr){
        int i = 0;
        int j = 0;
        int ans = 0;
        int countO = 0;
        int countA = 0;
        while(j < n){
            char c = arr.charAt(j);
            if(countO <= m){
                if(c == 'O'){
                    countO++;
                }
                else{
                    countA++;
                }
                j++;
            }
            if(countO > m){
                char k = arr.charAt(i);
                if(k == 'A'){
                    countA--;
                }
                else{
                    countO--;
                }
                i++;
            }
            ans = Math.max(ans , (j - i));
        }
        if(ans == 0){
            return n;
        }
        return ans;
    }
}