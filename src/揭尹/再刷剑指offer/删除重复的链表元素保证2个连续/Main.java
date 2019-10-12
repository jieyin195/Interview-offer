package 揭尹.再刷剑指offer.删除重复的链表元素保证2个连续;

import 揭尹.再刷剑指offer.structure.ListNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/20
 * \* Time: 18:33
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Main {
    public static void main( String[] args ) {
        ListNode root1 = new ListNode(1);
        ListNode root2 = new ListNode(2);
        ListNode root3 = new ListNode(2);
        ListNode root4 = new ListNode(3);
        ListNode root5 = new ListNode(3);
        ListNode root6 = new ListNode(3);
        ListNode root7 = new ListNode(4);
        root1.next=root2;
        root2.next=root3;
        root3.next=root4;
        root4.next=root5;
        root5.next=root6;
        root6.next=root7;

        show(root1);
    }

    private static ListNode show( ListNode root ) {
        if(root==null||root.next==null)
            return root;
        if(root.val!=root.next.val){
            root.next=show(root.next);
        }else{
            ListNode cur = root.next;
            if(cur.next!=null&&cur.val==cur.next.val){
                ListNode a = cur.next;
                while(a.next!=null&&a.val==a.next.val)
                    a=a.next;
                root.next.next=show(a.next);
            }
            else{
                root.next.next=show(cur.next);
            }
        }
        return root;
    }
}
