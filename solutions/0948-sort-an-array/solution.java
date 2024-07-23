class Solution {
    public int[] sortArray(int[] arr) {

    devide(arr,0,arr.length-1);
    return arr;     

    }

    public void devide(int arr[],int left,int right)
    {
        if(left>=right)return ;
        int mid= left+(right-left)/2;

        devide(arr,left,mid);
        devide(arr,mid+1,right);
        merge (arr,left,mid,right);

    }

    public void merge(int arr[],int left,int mid,int right)
    {
        int temp[]=new int[right-left+1];
        int i=left;
        int j=mid+1;
        int index= 0;

        while(i<=mid && j<=right)
        {
            if(arr[i]>=arr[j])
            {
                temp[index]=arr[j];
                j++;
            }
            else
            {
                temp[index]=arr[i];
                i++;
            }
            index++;
        }
        while(i<=mid)
        {
           temp[index]=arr[i];
           i++;
           index++;
        }
        while(j<=right)
        {
            temp[index]=arr[j];
            j++;
            index++;
        }
           index=0;
        for(int k=left;k<=right;k++)
        {
            arr[k]=temp[index];
            index++;

        }
    }
}
