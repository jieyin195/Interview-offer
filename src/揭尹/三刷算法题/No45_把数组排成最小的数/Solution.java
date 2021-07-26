package 揭尹.三刷算法题.No45_把数组排成最小的数;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public String minNumber(int[] nums) {
        Queue<String> queue = new PriorityQueue<>((o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        for (int num : nums) {
            queue.add(String.valueOf(num));
        }
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll());
        }
        return sb.toString();
    }
}
