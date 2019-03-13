package LeetCode.No234;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @Author: zl
 * @Date: 2019/3/6 13:08
 * @Description:
 */
public class PalindromeNode {

    public static void main(String[] args) {
//        System.out.println("12".equals("21"));
        StringBuilder str = new StringBuilder("12");
        System.out.println(str.equals(str.reverse()));  // str.reverse()之后，str的值也发生了改变，所以最后的结果为true
        System.out.println(str.toString().equals(str.reverse().toString()));
        System.out.println(str.toString().contains(str.reverse().toString()));
        System.out.println("-------------------");
        str.delete(0,str.length());
        System.out.println(str.equals(str.reverse()));
        System.out.println(str.toString().equals(str.reverse().toString()));
        System.out.println(str.toString().contains(str.reverse().toString()));
    }

    /**
     *  首先不能用StringBuilder接收，因为接收的数字不是十位数以内的单个数字，用reverse（）方法无法正确判断是否对称回文
     *  其次，需要用equals（）方法进行比较，因为当链表节点存储的数值小于-128或大于127时，就超过了基本类型的范围，而包装类类型时对象，需要用equals进行比较
     *  另外，需要用到两个集合，让后分别进行添加。如果直接引用的话，则在两个对象指向的时一个引用
     *  最后，两个集合比较，需要逐一遍历比较。如果直接用equals比较，则比较的时两个集合里面所有的值是否相等
     */
    public boolean isPalindrome(ListNode head) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> listReverse = new LinkedList<>();
        ListNode cur = head;
        while (cur != null){
            list.add(cur.val);
            listReverse.add(cur.val);
            cur = cur.next;
        }
        Collections.reverse(listReverse);
        for (int i = 0; i < list.size(); i++) {
            if(!list.get(i).equals(listReverse.get(i)))
                return false;
        }
        return true;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
