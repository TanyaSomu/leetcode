import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
        int ans=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int l=0,r=0;r<fruits.length;r++){
               //mp.put(fruits[r],mp.getOrDefault(fruits[r],0)+1);
               mp.put(fruits[r],mp.getOrDefault(fruits[r],0)+1);
               while(mp.size()>2){
                mp.put(fruits[l],mp.get(fruits[l])-1);
                mp.remove(fruits[l],0);
                l++;
               } 
             ans=Math.max(ans,r-l+1);  
        }
        return ans;
    }
}