class Solution {
    public int[] sortArray(int[] arr) {
        
        devide(arr,0,arr.length-1);
        return arr;
    }


    public void devide(int arr[],int l,int r)
    {
        if(l<r)
        {
            int mid= l+(r-l)/2;
            devide(arr,l,mid);
            devide(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }


    public void merge(int arr[],int l,int mid,int r)
    {
           int left[]=new int[mid-l+1];
           int right[]=new int[r-mid];
           int j=l;
           for(int i=0;i<left.length;i++)
           {
            left[i]=arr[j];
            j++;
           }   
           j=mid+1;
           for(int i=0;i<right.length;i++)
           {
            right[i]=arr[j];
            j++;
           }

           j=0;
           int i=0;
           int k=l;

           while(i<left.length && j<right.length)
           {
                if(left[i]>right[j])
                {
                    arr[k]=right[j];
                    j++;
                }
                else
                {
                    arr[k]=left[i];
                    i++;
                }
                k++;
           }

           while(i<left.length)
           {
            arr[k]=left[i];
            i++;
            k++;
           }
           while(j<right.length)
           {
            arr[k]=right[j];
            j++;
            k++;
           }
    }
}
