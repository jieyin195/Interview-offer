package 揭尹.剑指offer.删除链表中重复的结点;

import java.util.List;

/**
 * Created by Jline on 2019/2/21.
 */
public class Solution {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null)
            return null;
        if(pHead.next ==null)
            return pHead;
        //ListNode cur = pHead;
        if(pHead.next.val != pHead.val){
            pHead.next = deleteDuplication(pHead.next);
        }else{
            ListNode cur = pHead.next;
            while(cur.next!=null&&cur.val==cur.next.val)
                cur = cur.next;
            pHead = deleteDuplication(cur.next);
        }
        return pHead;
    }

    public static void main( String[] args ) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode phead  = deleteDuplication(node1);
        while(phead!=null){
            System.out.println(phead.val);
            phead = phead.next;
        }
    }

}
