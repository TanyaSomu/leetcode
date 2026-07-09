class Solution {
    public long splitArray(int[] nums) {
        long sum1=0;
        long sum2=0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(i)) sum1+=nums[i];
            else sum2+=nums[i];
        }
        return Math.abs(sum1-sum2);
    }
    private boolean isPrime(int num){
        if(num<2) return false;
        if(num==2) return true;
        if(num%2==0) return false;
        for(int i=3;i*i<=num;i+=2){
            if(num%i==0) return false;
        }
            return true;
    }
}