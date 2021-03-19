class Solution {
    public int busyStudent(int[] s, int[] f, int q) {
          int count=0;
     int l1= Math.min((s.length),(f.length));
    for(int i=0;i<l1;i++)
    {
        if(s[i]<=q && q<=f[i] )
        {
            count++;
        }
    }
    return count;
        
    }
}
