package 揭尹.三刷算法题.No23_链表中环的入口节点;

import 揭尹.再刷剑指offer.structure.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)
            return null;
        ListNode p1 = head;
        ListNode p2 = head;
        while(p1!=null&&p1.next!=null){
            p1=p1.next.next;
            p2=p2.next;
            if(p1==p2){
                p1=head;
                while(p1!=p2){
                    p1=p1.next;
                    p2=p2.next;
                }
                return p1;
            }
        }
        return null;
    }
}
