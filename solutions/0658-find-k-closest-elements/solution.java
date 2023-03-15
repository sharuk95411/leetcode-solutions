class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer>ans= new ArrayList<>();
        if(arr.length==1) 
        {
ans.add(arr[0]);
return ans;
        } 
        int lower_bound= lower(0,arr.length-1,arr,x);
        System.out.println("Lower Bound is "+lower_bound);
        int a=lower_bound-1;
        int b=lower_bound;
        while(k>0)
        {
             if(b>=arr.length)
             {
                 a--;
                 k--;
             }
             else if(a<0)
             {
                 b++;
                 k--;
             }
             else if(a>=0 && b<arr.length && Math.abs(arr[a]-x)>Math.abs(arr[b]-x))
             {
                       b++;
                       k--;
             }
             else 
             {
                 a--;
                 k--;
             }
        }
        a=a+1;
        while(a<b)
        {
            ans.add(arr[a]);
            a++;
        }
        return ans;
    }
public int lower(int l,int r,int arr[],int target)
{
    int ans=r;
    while(l<=r)
    {
        int mid=l+(r-l)/2;
        if(arr[mid]>=target)
        {
            ans= mid;
            r=mid-1;

        }
        else if(target>arr[mid]) l=mid+1;
    }
    return ans;
}

}
