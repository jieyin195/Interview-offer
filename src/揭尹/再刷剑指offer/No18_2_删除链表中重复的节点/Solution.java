package 揭尹.再刷剑指offer.No18_2_删除链表中重复的节点;

import 揭尹.再刷剑指offer.structure.ListNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/13
 * \* Time: 15:38
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public ListNode deleteDuplication( ListNode head)
    {
        /*
        递归
         */
        if(head==null)
            return null;
        if(head.next==null)
            return head;

        if(head.val!=head.next.val){
            head.next=deleteDuplication(head.next);
        }else{
            ListNode cur = head.next;
            while (cur.next != null && cur.val == cur.next.val) {
                cur=cur.next;
            }
            head=deleteDuplication(cur.next);
        }
        return head;
    }
}
