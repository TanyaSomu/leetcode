class Solution {
    public String removeStars(String s) {
        StringBuilder c=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                c.deleteCharAt(c.length()-1);
            }
            else{
                c.append(ch);
            }
        }
        return c.toString();
    }
}