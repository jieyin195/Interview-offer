package 揭尹.再刷剑指offer.No4_二维数组中的查找;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/8/5
 * \* Time: 17:51
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
            return false;
        int rowMax=matrix.length-1,colMax=matrix[0].length-1;
        int rowCur=0,colCur=matrix[0].length-1;
        while(true){
            if(rowCur>rowMax || colCur<0 )
                return false;
            if(matrix[rowCur][colCur]==target)
                return true;
            else if(matrix[rowCur][colCur]<target)
                rowCur++;
            else
                colCur--;
        }

    }
}
