class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        List<Integer>ans= new ArrayList<>();
    
        int l= 0;
        int mid=0;
        int r= arr.length-1;
        int n= arr.length;
        if(x<arr[l])
        {
            while(k>0)
        {
            ans.add(arr[l]);
            k--;
            l++;
        }
        }
        else if(x>arr[r])
        {
            while(k>0)
            {
          ans.add(arr[r]);
            r--;
            k--;
            }
            
        }
        
       else
       {
           l=0;
           r=n-1;
           System.out.println("IN ELSE");
           while(l<=r)
        {
             mid= l+(r-l)/2;
            if(arr[mid]==x) break;
            else if(arr[mid]>x)
            {
                r=mid-1;
            }
            else l=mid+1;

        }
        if(l>r)
        {
            int temp=l;
            l=r;
            r=temp;
        }
        else if(arr[mid]==x)
        {
            l=mid-1;
            r=mid;
        }
        while((l>=0 && r<n) && k>0)
        {

            int a =Math.abs(arr[l]-x);
            int b= Math.abs(arr[r]-x);
            if(a>b)
            {
             ans.add(arr[r]);
             r++;
             k--;   
            }
            else if(a<=b)
            {
             ans.add(arr[l]);
             l--;
             k--;
            }

        }
        System.out.println("SUB ANS IS "+r);
        while(l>=0 &&k>0)
        {
            ans.add(arr[l]);
            l--;
            k--;
        }
        while(r<n && k>0)
        {
            ans.add(arr[r]);
            r++;
            k--;
        }
        System.out.println("OR IS "+ans);
       
       }

          Collections.sort(ans);
        
        return ans;

    }
}
