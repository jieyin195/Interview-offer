package 朱磊.LeetCode.No2;

/**
 * @Author: zl
 * @Date: 2019/3/1 13:50
 * @Description:
 */
public class TwoNumberAdd {

    public ListNode unRecursionSolution(ListNode l1, ListNode l2) {

        int carryFlag = 0;  // 进位标识
        ListNode newList = new ListNode(0); // 创建一个新节点
        ListNode cur = newList;
        while(l1 != null || l2 != null){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carryFlag;
            carryFlag = sum / 10;   // 判断进位
            cur.next = new ListNode(sum % 10);  // 添加新节点
            cur = cur.next;

            // 为之前某一个字符串已经指向空后做维护
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        // 最高位进位，则再向前添加一个节点
        if(carryFlag > 0)
            cur.next = new ListNode(carryFlag);

        return newList.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
