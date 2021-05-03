class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
         Stack<Integer>s= new Stack<>();
        int i=0 ,j=0;
        for(i=0;i<pushed.length;i++)
        {
            s.push(pushed[i]);
            while(s.size()>0 && s.peek()==popped[j])
            {
                s.pop();
                j++;
            }
        }
        if(s.size()>1) return false;
        else return true;
        
    }
}
