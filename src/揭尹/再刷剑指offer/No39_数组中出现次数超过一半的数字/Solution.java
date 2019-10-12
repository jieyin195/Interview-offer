package 揭尹.再刷剑指offer.No39_数组中出现次数超过一半的数字;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/21
 * \* Time: 23:18
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        
        int res=array[0];
        int count=1;
        for (int i = 1; i < array.length; i++) {
            if(count==0){
                res=array[i];
                count=1;
            }
            else if(array[i]==res){
                count++;
            }else
                count--;
        }
        count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==res)
                count++;
        }
        return count>array.length/2?res:0;
    }
}
