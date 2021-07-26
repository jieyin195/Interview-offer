package 揭尹.三刷算法题.No22_链表中倒数第k个节点;

import 揭尹.再刷剑指offer.structure.ListNode;

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        while(p1!=null&&--k>0){
            p1=p1.next;
        }
        if(p1==null)
            return null;
        else{
            while(p1.next!=null){
                p1=p1.next;
                p2=p2.next;
            }
        }
        return p2;
    }
}
