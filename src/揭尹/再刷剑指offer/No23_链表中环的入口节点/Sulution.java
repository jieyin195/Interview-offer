package 揭尹.再刷剑指offer.No23_链表中环的入口节点;

import 揭尹.再刷剑指offer.structure.ListNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/13
 * \* Time: 20:04
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Sulution {
    public ListNode EntryNodeOfLoop( ListNode head)
    {
        if(head==null||head.next==null)
            return head;
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
