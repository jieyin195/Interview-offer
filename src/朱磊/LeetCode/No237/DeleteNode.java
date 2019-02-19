package 朱磊.LeetCode.No123;

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

}
