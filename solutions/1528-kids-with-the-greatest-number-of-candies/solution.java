class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int temp=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>temp)
            {
                temp= candies[i];
            }
        }
        List<Boolean>b= new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=temp)
            {
                b.add(true);
            }
            else
            {
                b.add(false);
            }
        }
        return b;
        
    }
}
