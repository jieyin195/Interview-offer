package 揭尹.剑指offer.反转链表;

/**
 * Created by Jline on 2019/2/19.
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {


    public static ListNode ReverseList(ListNode head) {
        /**
         *
         */
        ListNode pre = null;
        ListNode node = head;
        ListNode reverHead = null;
        while(node!=null){
            ListNode Next = node.next;
            if(Next==null)
                reverHead = node;
            node.next=pre;
            pre=node;
            node=Next;
        }
        return reverHead;
        /**
         * 递归
         */
        //return digui(head);
    }

    private static ListNode digui( ListNode head ) {
        if (head == null||head.next==null){
            return head;
        }
        ListNode reverNode =ReverseList(head.next);
        //reverNode在head.next上。return之后就没了
        head.next.next=head;
        head.next=null;
        return reverNode;
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

        ListNode phead = ReverseList(node1);
        while (phead != null) {
            System.out.println(phead.val);
            phead = phead.next;
        }
    }

}
