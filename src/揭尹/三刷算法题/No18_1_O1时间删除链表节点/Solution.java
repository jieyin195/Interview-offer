package 揭尹.三刷算法题.No18_1_O1时间删除链表节点;

import 揭尹.再刷剑指offer.structure.ListNode;

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val)
            return head.next;
        ListNode pre =head,cur =head;
        while(cur!=null&&cur.val!=val){
            pre= cur;
            cur=cur.next;
        }
        if(cur!=null)
            pre.next=cur.next;
        return head;
    }
}
