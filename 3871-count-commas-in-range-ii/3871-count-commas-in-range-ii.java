class Solution {
    public long countCommas(long n) {
        // if(n<1000) return 0;
        long res=0;
        long p=1000;
        for(int i=1;i<=5;i++){
            if(n>=p){
                res+=n-p+1;
            }
            p*=1000;
        }
        return res;
    }
}