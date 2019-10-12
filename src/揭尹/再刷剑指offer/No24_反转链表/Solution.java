package 揭尹.再刷剑指offer.No24_反转链表;

import 揭尹.再刷剑指offer.structure.ListNode;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/13
 * \* Time: 21:02
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public static ListNode ReverseList( ListNode head) {
        /*
        非递归
         */
        ListNode node = head;
        ListNode pre = null;
        ListNode reverNode= null;
        while(node!=null){
            ListNode Next = node.next;
            if(Next==null)
                reverNode=node;
            node.next=pre;
            pre=node;
            node=Next;
        }
        return reverNode;
    }
    public static ListNode ReverseList2( ListNode head) {
        /*
        递归
         */
        if(head==null || head.next==null)
            return head;

        ListNode reverseHead =ReverseList2(head.next);
        head.next.next=head;
        head.next=null;
        return reverseHead;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next= new ListNode(2);
        head.next.next = new ListNode(3);
        System.out.println(head);
        head = ReverseList2(head);
        System.out.println(head);
    }
}
