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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newhead = reverse(slow.next);
        ListNode first = head;
        ListNode second = newhead;
        while(second != null){
            if(first.val != second.val){
                reverse(newhead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverse(newhead);
        return true;
    }
    private static ListNode reverse(ListNode newhead){
        if(newhead == null || newhead.next == null){
            return newhead;
        }
        return null;
    }
}