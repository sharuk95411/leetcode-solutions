/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        
        if(head==null) return 0;
        
        int arr[]= new int[30];
        
        ListNode temp= head;
        int i= 0;
        int count=0;
        while(temp!=null)
        {
            arr[i]= temp.val;
            temp= temp.next;
            i++;
            count++;
        }
        
       // System.out.println(Arrays.toString(arr));
        System.out.println("count "+count);
        int start_position= count-1;
        int ans=0;
        int multiplier=1;
        while(start_position>=0)
        {
           // System.out.println("mul "+multiplier);
            if(arr[start_position]!=0)
            {
                ans= ans+multiplier;
               // System.out.println("ans "+ans);
                
            }
            
            start_position--;
            multiplier=multiplier*2;
            
        }
        return ans;
    }
}
