class Solution {
    public int minSteps(String s, String t) {
       int[] freq=new int[26];
       int[] count=new int[26];
       int steps=0;
       for(char c:s.toCharArray()){
        freq[c-'a']++;
       }
        for(char c:t.toCharArray()){
            freq[c-'a']--;
        }
        for(int i=0;i<26;i++){
            steps+=Math.abs(freq[i]-count[i]);
        }
        return steps/2;
    }
}