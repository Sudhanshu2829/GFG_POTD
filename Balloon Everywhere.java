class Solution {
    public int maxInstance(String s) {
        int[] charCount = new int[26];
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        int[] targetCount = new int[26];
        for (char c : "balloon".toCharArray()) {
            targetCount[c - 'a']++;
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (targetCount[i] > 0) {
                min = Math.min(min, charCount[i] / targetCount[i]);
            }
        }
        
        return min;
    }
}