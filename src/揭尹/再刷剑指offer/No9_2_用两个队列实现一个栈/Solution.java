package 揭尹.再刷剑指offer.No9_2_用两个队列实现一个栈;

import java.util.LinkedList;
import java.util.Queue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/8/6
 * \* Time: 16:56
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push( int node ) {
        if(!queue1.isEmpty())
            queue1.offer(node);
        else
            queue2.offer(node);
    }

    public int pop() {
        if(!queue1.isEmpty()){
            int size=queue1.size();
            for (int i = 0; i < size-1; i++) {
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        }else if (!queue2.isEmpty())
            {
            int size=queue2.size();
            for (int i = 0; i < size - 1; i++) {
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }else
            throw new RuntimeException("删除异常");
    }

}
