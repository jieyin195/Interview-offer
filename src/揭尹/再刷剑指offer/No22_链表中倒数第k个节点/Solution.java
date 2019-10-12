package 揭尹.再刷剑指offer.No22_链表中倒数第k个节点;

import 揭尹.再刷剑指offer.structure.ListNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/13
 * \* Time: 17:19
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public ListNode FindKthToTail( ListNode head, int k) {
        if(head==null||k==0)
            return null;
        ListNode p1 = head;
        ListNode p2 =head;
        for (int i = 0; i < k-1; i++) {
            if(p1.next!=null)
                p1=p1.next;
            else
                return null;
        }
        while(p1.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
    }
}
