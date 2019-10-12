package 揭尹.再刷剑指offer.No18_1_O1时间删除链表节点;

import 揭尹.再刷剑指offer.structure.ListNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/13
 * \* Time: 15:14
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public void DeleteNode( ListNode head, ListNode node){
        if(head==node){
            head=head.next;
        }else if(node.next!=null){
            node.val=node.next.val;
            node.next=node.next.next;
        }else{
            ListNode cur = head;
            while(cur.next!=node){
                cur=cur.next;
            }
            cur.next=null;
        }

    }
}
