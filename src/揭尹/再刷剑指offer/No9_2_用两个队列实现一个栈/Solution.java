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
        if(queue2.isEmpty())
            queue1.add(node);
        else if(queue1.isEmpty())
                queue2.add(node);
    }

    public int pop() {
        if (queue2.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());

            }
            return queue1.poll();
        } else if(queue1.isEmpty()){
            while (queue2.size() > 1) {
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        }else{
            throw new RuntimeException("数据不存在，无法删除!");
        }
    }

}
