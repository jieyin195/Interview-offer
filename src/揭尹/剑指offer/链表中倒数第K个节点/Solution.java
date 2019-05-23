package 揭尹.剑指offer.链表中倒数第K个节点;

import java.util.Arrays;

/**
 * Created by Jline on 2019/4/2.
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||head.next==null)
            return head;
        ListNode p =head;
        int i = 0;
        for (; head!=null ; i++) {
            if(i>=k)
                p=p.next;
            head=head.next;
        }
        return i<k?null:p;
    }
}
