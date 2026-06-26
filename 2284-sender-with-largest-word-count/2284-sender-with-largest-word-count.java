import java.util.*;
class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String,Integer> map=new HashMap<>();
        int max=0;
        String name="";
        for(int i=0;i<messages.length;i++){
            String[] words=messages[i].split(" ");
            map.put(senders[i],map.getOrDefault(senders[i],0)+words.length);
            if(map.get(senders[i])>max){
                max=map.get(senders[i]);
                name=senders[i];
            }
            else if(map.get(senders[i])==max && name.compareTo(senders[i])<0){
                name=senders[i];
            }
        }
        return name;
    }
}