/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(null == l1 && null == l2){
            return null;
        }
        ListNode ret = new ListNode(0);
        ListNode p = ret;
        int carry = 0;
        while(l1 != null || l2 != null){
            int l = (l1 == null)? 0 : l1.val;
            int r = (l2 == null)? 0 : l2.val;
            int sum = carry + l + r;
            int val = (sum) % 10;
            carry = (sum) / 10;
            p.val = val;
            p.next = new ListNode(carry);
            p = p.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        if(carry == 0){
            p.val = -1;
        }
        p = ret;
        while(p.next != null){
            if(p.next.val == -1){
                p.next = null;
                break;
            }
            p = p.next;
        }
        return ret;
    }
}
