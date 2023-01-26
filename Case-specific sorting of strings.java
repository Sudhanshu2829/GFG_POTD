class Solution
{
    public static String caseSort(String str)
    {
      char [] arr = new char[str.length()];
        for(int i =0; i<arr.length; i++){
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr);
        int k =0;
         StringBuffer string = new StringBuffer(str);
        for(int j =0; j<str.length(); j++){
            if(Character.isUpperCase(str.charAt(j))){
               string.setCharAt(j, arr[k]);
               k++;
            }
        }
        for(int j =0; j<str.length(); j++){
            if(Character.isLowerCase(str.charAt(j))){
                string.setCharAt(j, arr[k]);
                k++;
            }
        }
       return string.toString();
    }
}