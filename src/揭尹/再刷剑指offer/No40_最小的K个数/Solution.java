package 揭尹.再刷剑指offer.No40_最小的K个数;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/22
 * \* Time: 0:33
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution( int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(k==0||k>input.length)
            return list;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k,( o1, o2 ) -> o2-o1);
        for (int i = 0; i < input.length; i++) {
            if(maxHeap.size()!=k){
                maxHeap.offer(input[i]);
            }else if(input[i]<maxHeap.peek()){
                maxHeap.poll();
                maxHeap.offer(input[i]);
            }
        }
        for(Integer i:maxHeap){
            list.add(i);
        }
        return list;
    }
}
