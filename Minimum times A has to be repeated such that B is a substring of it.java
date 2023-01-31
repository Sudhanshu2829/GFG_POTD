class Solution {
    
    static int minRepeats(String a, String b) {
        String rep = a;
        int c = 1; 
        while(a.length()<b.length()){
            a+=rep;
            c++;
        }
    if(a.contains(b)==true)return c;
    a+=rep;
    c++;
    
    if(a.contains(b)==true)return c;
        return -1;
    }
};