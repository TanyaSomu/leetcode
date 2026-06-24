import java.util.*;
class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            mp.put(tasks[i],mp.getOrDefault(tasks[i],0)+1);
        } 
        // if(mp.containsValue(1)) return -1;
        int res=0;
        for(int num:mp.values()){
            if(num==1) return -1;
            res+=num/3;
            // res+=(num+2)/3;
            if(num%3!=0) res++;
        }
        return res;
    }
}