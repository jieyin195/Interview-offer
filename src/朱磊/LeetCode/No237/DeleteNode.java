package LeetCode.No237;

/**
 * @Author: zl
 * @Date: 2019/3/4 23:14
 * @Description:
 */
public class DeleteNode {

    public void deleteNode(ListNode node) {
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
