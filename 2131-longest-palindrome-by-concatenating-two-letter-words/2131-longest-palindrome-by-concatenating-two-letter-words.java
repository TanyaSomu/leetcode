import java.util.*;
class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map=new HashMap<>();
        int ans=0;
        for(String s:words){
            String rev=""+s.charAt(1)+s.charAt(0);
            if(map.getOrDefault(rev,0)>0){
                ans+=4;
                map.put(rev,map.get(rev)-1);
            }
            else{
                map.put(s,map.getOrDefault(s,0)+1);            }
        }
    
    for(String s:map.keySet()){
        if(s.charAt(0)==s.charAt(1) && map.get(s)>0){
            ans+=2;
            break;
        }
    }
    return ans;
}
}