class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int res=0;
        int n=reward1.length;
        int[] diff=new int[n];
        for(int i=0;i<n;i++){
            diff[i]=reward1[i]-reward2[i];
            res+=reward2[i];
        }
        Arrays.sort(diff);
        for(int i=0;i<k;i++){
               res+=diff[n-i-1]; 
        }
        return res;
    }
}