package 揭尹.再刷剑指offer.No57_和为S的数字;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/23
 * \* Time: 23:25
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum( int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        int left=0;
        int right=array.length-1;

        while(left<right){
            if(array[left]+array[right]==sum){
                list.add(array[left]);
                list.add(array[right]);
                return list;
            }else if(array[left]+array[right]<sum){
                left++;
            }else{
                right--;
            }
        }
        return list;
    }
}
