package 揭尹.剑指offer.数组_构建数组乘积;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/6/2
 * \* Time: 13:52
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        if(A.length!=0){
            B[0]=1;
            for (int i = 1; i < A.length; i++) {
                B[i]=B[i-1]*A[i-1];
            }
            int temp=1;
            for (int i = A.length-1; i > 0; i--) {
                temp = temp*A[i];
                B[i-1]*=temp;
            }
        }
        return B;
    }
}
