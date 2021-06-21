class Solution {
    // Isme hme rotated array dia jyga and ye rotation kse hga wo bataya gya h quesion me so hme rotated array me element index find krna h 
    public int search(int[] arr, int target) {
           int start=0;
        int end= arr.length-1;
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[start]<=arr[mid])
            {
                if(target>=arr[start] && target<=arr[mid])
                {
                    end= mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else
            {
                if(target>=arr[mid] && target<=arr[end])
                {
                    start=mid+1;
                }
                else
                {
                end= mid-1;;
                }
            }
            
        }
        return -1;
        
    }
}
