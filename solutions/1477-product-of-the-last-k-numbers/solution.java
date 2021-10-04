class ProductOfNumbers {

    List<Integer>l;
    int product;
    public ProductOfNumbers() {
        l= new ArrayList<>();
        product=1;
    }
    
    public void add(int num) {
     if(num==0) 
     {
         product=1;
        // l.clear() but it will Take O(n) TC
         l= new ArrayList<>();
         return;
     }
        product=product*num;
        l.add(product);
    }
    
    public int getProduct(int k) {
        
          if(l.size()<k) return 0;
            int ans= l.get(l.size()-1);
        if(k==l.size()) return ans;
      
       return (ans/l.get(l.size()-k-1));
    }
    }

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
