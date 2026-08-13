class Solution {
    public int minSwapsCouples(int[] row) {
        int[] position = new int[row.length];
        for(int i=0; i< row.length; i++){
            position[row[i]] = i;
        }
        int count = 0;
        for(int i=0; i<row.length; i+=2){
            int first = row[i];
            int partner = first ^ 1;
            int partnerIdx = position[partner];
            if(row[i+1] != partner){
                int other = row[i+1];
                row[i+1] = partner;
                row[partnerIdx] = other;
                position[partner] = i+1;
                position[other] = partnerIdx;
                count++;
            }
        }
        return count;
    }
}