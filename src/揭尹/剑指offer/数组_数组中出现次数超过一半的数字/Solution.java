package 揭尹.剑指offer.数组_数组中出现次数超过一半的数字;

import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/23
 * \* Time: 14:35
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(!hashMap.containsKey(array[i]))
                hashMap.put(array[i],1);
            else
                hashMap.put(array[i],hashMap.get(array[i])+1);
        }

        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if(entry.getValue()>array.length/2){
                return entry.getKey();
            }
        }
        return 0;
    }
}
