package 揭尹.三刷算法题.No4_二维数组中的查找;

public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0)
            return false;
        int n = matrix.length,m=matrix[0].length;
        int row =0,col = m-1;
        while(row<n&&col>=0){
            if(matrix[row][col]<target){
                row++;
            }else if(matrix[row][col]>target){
                col--;
            }else{
                return true;
            }
        }
        return false;
    }
}
