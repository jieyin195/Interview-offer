package 揭尹.三刷算法题.No18_2_删除链表中重复的节点;

import 揭尹.再刷剑指offer.structure.ListNode;

public class Solution {
    public ListNode deleteDuplication(ListNode head)
    {
        if(head==null||head.next==null)
            return head;
        if(head.val!=head.next.val){
            head.next=deleteDuplication(head.next);
        }else{
            ListNode cur = head.next;
            while(cur.next!=null && cur.val==cur.next.val){
                cur = cur.next;
            }
            head = deleteDuplication(cur.next);
        }
        return head;
    }
}
