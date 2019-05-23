package 揭尹.剑指offer.链表中环的入口结点;

/**
 * Created by Jline on 2019/4/5.
 */
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null||pHead.next==null)
        return pHead;
        ListNode p1 =pHead;
        ListNode p2 =pHead;
        while(p1!=null&&p1.next!=null){
            p1=pHead.next.next;
            p2=pHead.next;
            if(p1==p2){
                p1=pHead;
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
