class Solution {
    public int findComplement(int num) {
        if(num==0) return 0;
        ArrayList<Integer>list= new ArrayList<>();
        while(num>0)
        {
            if(num%2==0)
            {
                list.add(0);
                num=num/2;
                
            }
            else
            {
                list.add(1);
                num= num/2;
            }
        }
        //  list.set(2, "E");
        System.out.println(list);
        
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==0)
            {
                list.set(i,1);
            }
            else
            {
                list.set(i,0);
            }
        }
        int mul=1;
        int ans=0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==0)
            {
                ans=ans+0;
                mul=mul*2;
            }
            else
            {
                ans= ans+mul;
                mul=mul*2;
            }
        }
        
        System.out.println(list);
        return ans;
    }
}
