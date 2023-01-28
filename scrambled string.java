
class Solution{
    static boolean isScramble(String S1,String S2)
    {
        //code here
        if (S1.length() != S2.length()) return false;
        if (S1.equals(S2)) return true;
        int dada = S1.length();
        boolean[][][] afterSwap = new boolean[dada][dada][dada + 1];
        for (int i = 0; i < dada; i++) {
            for (int j = 0; j < dada; j++) {
                if (S1.charAt(i) == S2.charAt(j)) afterSwap[i][j][1] = true;
                else afterSwap[i][j][1] = false;
            }
        }
        for (int l = 2; l <= dada; l++) {
            for (int i = 0; i <= dada - l; i++) {
                for (int j = 0; j <= dada - l; j++) {
                    afterSwap[i][j][l] = false;
                    for (int k = 1; k < l; k++) {
                        if (afterSwap[i][j][k] && afterSwap[i+k][j+k][l-k]) {
                            afterSwap[i][j][l] = true;
                            break;
                        }
                        if (afterSwap[i][j+l-k][k] && afterSwap[i+k][j][l-k]) {
                            afterSwap[i][j][l] = true;
                            break;
                        }
                    }
                }
            }
        }
        return afterSwap[0][0][dada];
    }
}