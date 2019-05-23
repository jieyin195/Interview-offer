package 揭尹.剑指offer.顺时针打印矩阵;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/18
 * \* Time: 17:11
 * \* To change this template use File | Settings | File Templates.
 * \* Description:输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 *              例如，如果输入如下4 X 4矩阵：
 *              1 2 3 4
 *              5 6 7 8
 *              9 10 11 12
 *              13 14 15 16
 * 则依次打印出数字1,2,3,4,
 *              8,12,16,15,
 *              14,13,9,5,
 *              6,7,11,10.
 * \
 */
public class Solution {
    public static ArrayList<Integer> printMatrix( int [][] array) {

        ArrayList<Integer> result = new ArrayList<Integer> ();
        if(array.length==0) return result;
        int n = array.length,m = array[0].length;
        int layers =(int)Math.ceil(Math.min(n,m)/2.0);//这个是层数
        for(int i=0;i<layers;i++){
            for(int k = i;k<m-i;k++)
                result.add(array[i][k]);//左至右
            for(int j=i+1;j<n-i;j++)
                result.add(array[j][m-i-1]);//右上至右下
            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--)
                result.add(array[n-i-1][k]);//右至左
            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--)
                result.add(array[j][i]);//左下至左上
        }
        return result;
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n =sc.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println(printMatrix(array));
    }
}
