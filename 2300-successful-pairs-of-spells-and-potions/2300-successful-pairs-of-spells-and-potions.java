class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
         Arrays.sort(potions);
        int n=spells.length;
        int m=potions.length;
        int[] pair=new int[n];
        for(int i=0;i<n;i++){
            // int a=spells[i];
            int left=0;
            int right=m-1;
            // int ans=m;
            while(left<=right){
                int mid=left+(right-left)/2;
                if((long)spells[i]*potions[mid]>=success){
                    // ans=mid;
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            // if((long)spells[i]*potions[left]>=success) pair[i]=m-left;
            // else pair[i]=0;
            pair[i]=m-left;
        }
        return pair;
    }
}