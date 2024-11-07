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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode list3 = new ListNode();
        ListNode temp3 = list3;
        
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<temp2.val)
            {
                ListNode a = new ListNode(temp1.val);
                temp3.next = a;
                temp3 = a;
                temp1 = temp1.next;
            }
            else
            {
                ListNode b = new ListNode(temp2.val);
                temp3.next = b;
                temp3 = b;
                temp2 = temp2.next;
            }
        }
        if(temp1!=null)
        {
            temp3.next = temp1;
        }
        if(temp2!=null)
        {
            temp3.next = temp2;
        }
        return list3.next;
    }
}