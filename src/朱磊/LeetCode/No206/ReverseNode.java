package 朱磊.LeetCode.No206;

/**
 * @Author: zl
 * @Date: 2019/3/12 13:02
 * @Description: 反转一个单链表。
 */
public class ReverseNode {

    public static void main(String[] args) {

    }

    // 非递归做法（新开辟一个头节点，然后不断指向之从前一个链表取下的元素）
    public ListNode reverseList(ListNode head) {
        ListNode first = head;
//        ListNode reverseHead = null; //建立一个新的节点用来存放结果
        ListNode reverseHead = new ListNode(-1);   // 建立一个新节点作为头节点

        while (first != null) {
            ListNode second = first.next; //先处理第一个节点first，所以需要一个指针来存储first的后继
            first.next = reverseHead; //将first放到新链表头节点的头部
            reverseHead = first; //移动新链表的头指针，让它始终指向新链表头部
            first = second; //继续处理原链表的节点，即之前指针存放的后继，循环往复
        }
        return reverseHead;
    }

    // 递归做法
    public ListNode recursionSolution(ListNode head) {

        if(head == null || head.next == null)
            return head;
        /**
         *  head -> 1 -> 2 -> 3 -> 4 -> 5
         */
        ListNode reverseHead = recursionSolution(head.next);
        /**
         *                head
         *  1 -> 2 -> 3 -> 4    //   5 <- reverseHead
         *           head
         *  1 -> 2 -> 3     //   4 <- 5 <- reverseHead
         *      ...
         */
        head.next.next = head;  // head.next指向head节点
        /**
         *               head       head
         *  1 -> 2 -> 3 -> 4    //   4 <- 5 <- reverseHead
         *           head       head
         *  1 -> 2 -> 3     //   3 <- 4 <- 5 <- reverseHead
         *      ...
         */
        head.next = null;   // 去掉作为链尾的head
        /**
         *                head
         *  1 -> 2 -> 3 -> 4    //   4 <- 5 <- reverseHead
         *           head
         *  1 -> 2 -> 3    //   3 <- 4 <- 5 <- reverseHead
         *      ...
         */
        return reverseHead;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
