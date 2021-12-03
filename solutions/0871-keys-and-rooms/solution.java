class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        List<Integer>visited= new ArrayList<>();
        visited.add(0);
        Stack<Integer>stack= new Stack<>();
        stack.add(0);
        
        while(stack.size()>0)
        {
            List<Integer>keys= rooms.get(stack.pop());
            
            for(int key: keys)
            {
                if(visited.contains(key)==false)
                {
                    visited.add(key);
                    stack.push(key);
                }
            }
        }
        
        if(visited.size()==rooms.size()) return true;
        else return false;
        
    }
}
