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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode tail = head;
        int len = 1;
        while(tail.next != null){
            len++;
            tail = tail.next;
        }
        if(k % len == 0){
            return head;
        }
        k = k % len;
        tail.next = head;
        ListNode newtail = findnewtail(head, len-k);
        head = newtail.next;
        newtail.next = null;
        return head;
    }
    public static ListNode findnewtail(ListNode temp, int k){
        for(int i = 1; i < k; i++){
            temp = temp.next;
        }
        return temp;
    }
}