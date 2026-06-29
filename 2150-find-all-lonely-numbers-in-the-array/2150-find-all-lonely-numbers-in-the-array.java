import java.util.*;
class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list1=new ArrayList<>();
        for(int num:nums){
            if(map.get(num)==1  && !map.containsKey(num-1) && !map.containsKey(num+1)){
                list1.add(num);
            }
        }
        return list1;
    }
}