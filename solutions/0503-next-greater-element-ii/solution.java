// monotonic decreasing stack ka concept use hua h.
// yha array kha se strt hga ye identyfity krna tmhra km h 
class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int l= arr.length;
        Stack<Integer>s= new Stack<>();
        s.push(arr[l-1]);
        int temp=0;
        for(int i=l-1;i>=0;i--)
        {
            if(arr[i]>=s.peek())
          {
                temp=arr[i];
                while(s.size()>0 && arr[i]>=s.peek())
                {
                    s.pop();
                }
         if(s.size()==0) // yha ab given element k right me isse bda koi element h ni to ab hum left side me start se us element tk dekhge jiske liye for loop lgaya gya h
                {
                    for(int j=0;j<=i;j++)
                    {
                        if(arr[j]>arr[i])
                        {
                            arr[i]=arr[j];
                            break;
                        }
                        if(j==i)
                        {
                            arr[i]=-1;
                        }
                        
                    }
                    s.push(temp);
                }
                
                else
                {
                    temp=arr[i];
                    arr[i]=s.peek();
                    s.push(temp);
                }
            }
            else
            {
                temp=arr[i];
                arr[i]=s.peek();
                s.push(temp);
            }
        }
    
     /*   while(s.size()>0 && arr[l-1]>=s.peek())
        {
            s.pop();
        }
        
        if(s.size()==0) arr[l-1]=-1;
        else arr[l-1]=s.peek();*/
        return arr;
        
    }
}
