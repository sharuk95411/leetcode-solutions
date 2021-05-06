// logic- LinkList k data ko array me dal dia then simple Monotonic decreasing  stack ka concept use kr lia h
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
    public int[] nextLargerNodes(ListNode head) {
        
        Stack<Integer>s= new Stack<>();
        ListNode node= head;
        while(node!=null)
        {
           s.push(node.val);
            node=node.next;
        }
        int arr[]= new int[s.size()];
        for(int i=arr.length-1;i>=0;i--)
        {
            arr[i]=s.pop();
        }
        int l= arr.length;
        int temp=0;
        s.push(arr[l-1]);
        arr[l-1]= 0;
        for(int i=l-2;i>=0;i--)
        {
            if(s.peek()>arr[i])
            {
               temp=arr[i];
                arr[i]=s.peek();
                s.push(temp);
            }
            else
            {
                while(s.size()>0 && arr[i]>=s.peek())
                {
                    s.pop();
                }
                if(s.size()==0)
                {
                    s.push(arr[i]);
                    arr[i]=0;
                }
                    else
                    {
                        temp=arr[i];
                        arr[i]=s.peek();
                        s.push(temp);
                    }
            }
        }
        return arr;
        
        
    }
}
