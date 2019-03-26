package 朱磊.LeetCode.No83;

import java.util.ArrayList;

public class DeleteRepetitionNode {

    ArrayList<Integer> arrayList = new ArrayList<>();

    public ListNode recursionSolution(ListNode head) {
        if(head == null)
            return null;
        if(!arrayList.contains(head.val)) {
            arrayList.add(head.val);
            head.next = recursionSolution(head.next);
        }else{
            head = head.next;
            head = recursionSolution(head);
        }
        return head;
    }

    public ListNode unRecursionSolution(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode cur = head;
        while (cur.next != null){
            if(cur.val == cur.next.val)
                cur.next = cur.next.next;
            else
                cur = cur.next;
        }

        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
