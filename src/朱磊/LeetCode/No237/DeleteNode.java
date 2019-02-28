package LeetCode.No237;

/**
 * Created by zl on 2019/2/19.
 */
public class DeleteNode {

    public static void deleteNode(ListNode node) {
        if(node == null || node.next == null)
            return;

        node.val = node.next.val;
        node.next = node.next.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
   }
}
