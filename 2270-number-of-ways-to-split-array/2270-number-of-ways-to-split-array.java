class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        long currSum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            currSum+=nums[i];
            if(currSum>=sum-currSum){
                count++;
            }
        }
        return count;
    }
}