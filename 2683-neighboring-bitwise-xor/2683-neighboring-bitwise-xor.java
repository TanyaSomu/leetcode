class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int ans=0;
        for(int i=0;i<derived.length;i++){
            ans^=derived[i];
        }
        if(ans==0) return true;
        return false;
    }
}