class Solution {
    public int numWays(int steps, int arrLen) {
        int mod = 1_000_000_007;
        int[] stays = {1};//step 0, starting point
        for(int step=1; step<=steps; step++){
            int[] tempStays = new int[Math.min(stays.length+1, arrLen)];
            
            for(int index=0; index<stays.length; index++){
                //stay for next step
                tempStays[index] = (tempStays[index] + stays[index])%mod;
                //move right for next step(only if current locindexation is not arrLen)
                if(index < tempStays.length-1){
                    tempStays[index+1] = (tempStays[index+1] + stays[index])%mod;
                }
                //move left for next step (only if current index is not 0)
                if(index > 0){
                     tempStays[index-1] = (tempStays[index-1] + stays[index])%mod;
                }
            }
            stays = tempStays;
        }
        return stays[0]; 
    }
}
