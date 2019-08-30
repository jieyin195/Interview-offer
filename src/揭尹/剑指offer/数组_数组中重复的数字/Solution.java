package 揭尹.剑指offer.数组_数组中重复的数字;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/6/2
 * \* Time: 13:37
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
public class Solution {
    public static void main( String[] args ) {
        int[] num = new int[]{2,3,1,3};
        int[] a = new int[1];
        System.out.println(duplicate(num,num.length,a));
    }
    public  static boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null || length==0){
            return false;
        }
        for (int i = 0; i < length; i++) {
            if(numbers[i]<0 || numbers[i]>length-1){
                return false;
            }
        }
        /*
            先判断数组中的第一个数是否跟角标i是相同的，相同的话就i++，不相同的话就判断这个数（M）与num[M]比较是否相同，不相同
            就换位置，保证M角标的数就是M。换完位置后第一个数继续跟i比较，所以要有while循环
            while最多执行
         */
        for (int i = 0; i < length; i++) {
            while(numbers[i]!=i){
                if(numbers[i]==numbers[numbers[i]]){
                    duplication[0]=numbers[i];
                    return true;
                }
                int temp = numbers[i];
                numbers[i]=numbers[temp];
                numbers[temp]=temp;
            }
        }
        return false;
    }

    /*
    空间复杂度为O(N)，不是很简单.
     */
    public boolean duplicate2(int numbers[],int length,int [] duplication) {
        if(length==0)
            return false;
        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < length; i++) {
            if(linkedHashMap.containsKey(numbers[i])){
                linkedHashMap.put(numbers[i],linkedHashMap.get(numbers[i])+1);
            }else{
                linkedHashMap.put(numbers[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:linkedHashMap.entrySet()){
            if(entry.getValue()>1) {
                duplication[0] = entry.getKey();
                break;
            }
        }
        if(linkedHashMap.containsKey(duplication[0]))
            return true;
        else
            return false;
    }
}
