package 揭尹.再刷剑指offer.No29_顺时针打印矩阵;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/14
 * \* Time: 22:10
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public ArrayList<Integer> printMatrix( int [][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        if(arr==null||arr.length==0)
            return list;
        int n=arr.length,m=arr[0].length;
        int layers = (int)Math.ceil(Math.min(n,m)/2.0);
        for (int i = 0; i < layers; i++) {
            for (int k = i; k <m-i ; k++) {
                list.add(arr[i][k]);
            }
            for (int j = i+1; j <n-i ; j++) {
                list.add(arr[j][m-i-1]);
            }
            for (int k = m-i-2; (k>=i)&&(n-i-1!=i) ; k--) {
                list.add(arr[n-i-1][k]);
            }
            for (int j = n-i-2; (j>i)&&(m-i-1!=i) ; j--) {
                list.add(arr[j][i]);
            }
        }
        return list;
    }
}
