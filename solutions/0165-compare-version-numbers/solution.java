class Solution {
    public int compareVersion(String s1, String s2) {
        
        String ss1[]= s1.split("\\.");
        String ss2[]= s2.split("\\.");
        
        int n= Math.max(ss1.length,ss2.length);
        
        for(int i=0;i<n;i++)
        {
            int v1= i<ss1.length? Integer.parseInt(ss1[i]): 0;
            int v2= i<ss2.length? Integer.parseInt(ss2[i]): 0;
            
            if(v1>v2) return 1;
            else if(v2>v1) return -1;
        }
        return 0;
    }
}
