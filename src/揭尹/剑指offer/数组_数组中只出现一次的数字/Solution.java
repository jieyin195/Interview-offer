package 揭尹.剑指offer.数组_数组中只出现一次的数字;

import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/27
 * \* Time: 14:23
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class Solution {
    public  void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        /*
        其实可以用到进制的思想，两个不同的数，他们的二进制位肯定不会全部都相同，必有不同的位，那么不同的位
        想异或，结果肯定为1，那么我们把是0的分为一组，是1的分为一组，那么两个数字肯定就不在一个组里面了，
        这样在不同的数组里面进行异或后，剩下的肯定是单个的数，成对的数都异或成0了。
         */
        if(array.length==2){
            num1[0]=array[0];
            num2[0]=array[1];
            return;
        }
        int bitCount = 0;
        for (int i = 0; i < array.length; i++) {
            bitCount^=array[i];
        }
        int index = findBitIndex(bitCount);
        for (int i = 0; i < array.length; i++) {
            if((array[i]>>index&1)==0){
                num1[0]^=array[i];
            }else
                num2[0]^=array[i];
        }
    }

    private  int findBitIndex( int bitCount ) {
        int index = 0;
        while((bitCount&1)==0&&index<32){
            bitCount>>=1;
            index++;
        }
        return index;
    }
}
