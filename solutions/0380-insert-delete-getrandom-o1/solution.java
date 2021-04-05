class RandomizedSet {

    List<Integer> list = new ArrayList<Integer>(); 
    Map<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
   
    public RandomizedSet() {
    
    }
      
    public boolean insert(int val) {
        if(hm.containsKey(val)) return false;
        list.add(val);
        hm.put(val,list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(hm.containsKey(val) == false)
            return false;
        int ind = hm.get(val);
        Collections.swap(list,ind,list.size()-1);
        int swappedWith = list.get(ind);
        hm.put(swappedWith,ind);
        list.remove(list.size()-1);
        hm.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random random = new Random();
        int n = random.nextInt(list.size());
        return list.get(n);
    }
}
