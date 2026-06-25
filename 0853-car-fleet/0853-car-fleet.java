class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int[] [] cars=new int[n][2]; 
        for(int i=0;i<n;i++){
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }
        Arrays.sort(cars,(a,b)->b[0]-a[0]);
        // Stack<Double> st=new Stack<>();
        // for(int[] car:cars){
        //     double time=(double)(target-car[0])/car[1];
        //     if(st.isEmpty()|| time>st.peek()){
        //         st.push(time);
        //     }
        // }
        // return st.size();
        double max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<n;i++){
            int pos=cars[i][0];
            int spd=cars[i][1];
            double time=(double) (target-pos)/spd;
            if(time>max){
                count++;
                max=time;
            }
        }
        return count;
    }
}