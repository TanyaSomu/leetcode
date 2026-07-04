import java.util.*;
class Solution {
    private boolean isVowel(char c){
        return c=='a' ||  c=='e' || c=='i' || c=='o' || c=='u';
    }
    public String sortVowels(String s) {
       int[] freq=new int[26];
       int[] first=new int[26];
       Arrays.fill(first,-1);
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(isVowel(c)){
            int idx=c-'a';
            freq[idx]++;
            if(first[idx]==-1) first[idx]=i;
        }
       }
       List<Character> list=new ArrayList<>();
       for(char c:"aeiou".toCharArray()){
        if(freq[c-'a']!=0) list.add(c);
       }
       list.sort((a,b)->{
        if(freq[a-'a']!=freq[b-'a']){
            return freq[b-'a']-freq[a-'a'];
        }
        else{
            return first[a-'a']-first[b-'a'];
        }
       });
       List<Character> sorted=new ArrayList<>();
       for(char c:list){
        int count=freq[c-'a'];
        while(count>0){
            sorted.add(c);
            count--;
        }
       }
        StringBuilder sb=new StringBuilder(s);
        int j=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                sb.setCharAt(i,sorted.get(j++));
            }
        }
        return sb.toString();
    }
}