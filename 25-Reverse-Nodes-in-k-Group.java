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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        ListNode temp = head;
        ListNode prevnode = null;
        while(temp != null){
            ListNode knode = findknode(temp,k);
            if(knode == null){
                if(prevnode != null){
                    prevnode.next=temp;
                }
                break;
            }
            ListNode nextnode = knode.next;
            knode.next = null;
            ListNode revhead = reverse(temp);
            if(prevnode == null){
                head = revhead;
            }
            else{
                prevnode.next = revhead;
            }
            prevnode = temp;
            temp = nextnode;
        }
        return head;
    }
    public static ListNode findknode(ListNode temp, int k){
        while(temp != null && --k > 0)
        {
            temp = temp.next;
        }
        return temp;
    }
     private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        return prev;
    }
}