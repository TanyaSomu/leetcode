class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l=0;
        int maxF=0;
        int result=0;
        int n=answerKey.length();
        int[] count=new int[26];
        for(int r=0;r<n;r++){
            maxF=Math.max(maxF,++count[answerKey.charAt(r)-'A']);
            while(r-l+1>maxF+k){
                --count[answerKey.charAt(l)-'A'];
                l++;
            }
            result=Math.max(result,r-l+1);
        }
        return result;
    }
}