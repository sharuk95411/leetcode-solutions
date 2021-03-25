// Logic take U forward se dekh lena idea ml jyga but uske logic ko implement krne se TC bht zyda aygi 
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     
        List<List<Integer>> l2 = new ArrayList<>();
        if(candidates==null || candidates.length==0)
            return l2;
        Arrays.sort(candidates);
        List<Integer> l1 = new ArrayList<>();
       A (l2,l1,candidates,target,0);
        return l2;
    }
     static void A(List<List<Integer>> l2, List<Integer> l1, int[] arr, int target, int strt)
    {
        if(target==0)
        {
            l2.add(new ArrayList<>(l1));
            return;
        }
        for(int i=strt; i<arr.length; i++)
        {
            if(arr[i]>target) // yha pr TC bht hi zyda reduce hgi bcz array ko already sort kr chuke h so yhi ye condition true hne pr loop exit ho jyga
// you can also write if(target<0) but isse TC bht zyda hgi phr whole array ko traverse krna pdega
                break;
            l1.add(arr[i]);
            A(l2,l1,arr,target-arr[i],i);
            l1.remove(l1.size()-1);
        }
}
}
