package 揭尹.剑指offer.数组_和为S的两个数字;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/27
 * \* Time: 16:37
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 *
 * 对应每个测试案例，输出两个数，小的先输出。
 */
import java.util.ArrayList;
public class Solution {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
//        int mid = sum/2;
//        int midIndex = 0;
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < array.length; i++) {
//             if(array[i]<=mid)
//                 midIndex=i;
//        }
//        for (int i = 0; i <=midIndex; i++) {
//            for (int j = midIndex+1; j <array.length ; j++) {
//                if(array[i]+array[j]==sum) {
//                    arrayList.add(array[i]);
//                    arrayList.add(array[j]);
//                    return arrayList;
//                }
//            }
//        }
//        return arrayList;
        /**
         * 最佳做法还是两个指针
         */
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(array == null || array.length==0)
            return arrayList;
        int left = 0,right = array.length-1;
        while(left<right){
            int cur = array[left]+array[right];
            if(cur==sum){
                arrayList.add(array[left]);
                arrayList.add(array[right]);
                return arrayList;
            }else if(cur<sum)
                left++;
            else
                right--;
        }
        return arrayList;
    }

    public static void main( String[] args ) {
        System.out.println(FindNumbersWithSum(new int[]{1,2,4,7,11,16},10));
    }
}