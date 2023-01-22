

class Solution {
    public static String removePair(String s) {
        String res="";
        
        for(int i=0;i<s.length();i++){
            if(res.length()==0){
                res+=s.charAt(i);
            }
            else{
                if(s.charAt(i)==res.charAt(res.length()-1))
                    res=res.substring(0,res.length()-1);
                    else
                    res+=s.charAt(i);
                
            }
        }
        if(res.length()==0)
        return "-1";
        return res;
    }
}
        