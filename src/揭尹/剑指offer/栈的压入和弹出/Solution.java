package 揭尹.剑指offer.栈的压入和弹出;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/18
 * \* Time: 19:47
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        /**
         * 错误答案
         */
        Stack<Integer> stack = new Stack<>();
        int count=0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            if(stack.peek()==popA[count]){
                stack.pop();
                count++;
            }
        }
        int len=popA.length-count;
        for (int i = 0; i < len; i++) {
            if(stack.peek()==popA[count]){
                stack.pop();
                count++;
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }

    public static void main( String[] args ) {
        int[] pushA={1,2,3,4,5};
        int[] popA={4,5,3,2,1};
        int[] popB={4,3,2,5,1};
        System.out.println(IsPopOrder(pushA,popB));
    }
}
