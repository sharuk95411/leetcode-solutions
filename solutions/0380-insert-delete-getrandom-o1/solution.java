class RandomizedSet {
HashMap<Integer,Integer>h;
    List<Integer>l;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        h= new HashMap<>();
      l= new ArrayList<>();  
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(h.containsKey(val)==true) return false;
        else
        {
         l.add(val);
            h.put(val,l.size()-1);
            return true;
        }
        
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(h.containsKey(val)==false) return false;
        else
        {
            int index= h.get(val);
            int temp= l.size()-1;
             Collections.swap(l, index, temp);
            int value= l.get(index);
            h.put(value,index);
            l.remove(l.size()-1);
            h.remove(val);
            return true;
        }
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random random = new Random();
        int n = random.nextInt(l.size());
        return l.get(n);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
