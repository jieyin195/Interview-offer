package 揭尹.剑指offer.二维数组的查找;

import java.util.Random;

/**
 * Created by Jline on 2019/2/25.
 */
public class Solution {
    /**
     * 暴力求解法
     * @param target
     * @param array
     * @return
     */
    public static boolean Find1(int target, int [][] array) {
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(target == array[i][j])
                    return true;
            }
        }
        return false;
    }

    /**
     * 坐标法
     * @param target
     * @param array
     * @return
     */
    public static boolean Find2(int target, int [][] array) {
        int rowCount = array.length-1;
        int colCount = array[0].length-1;
        for (int i =rowCount, j=0 ; i>=0 && j <=colCount ;) {
            if(array[i][j]>target){
                i--;
                continue;
            }else if(array[i][j]<target){
                j++;
                continue;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main( String[] args ) {
        long aaa=System.currentTimeMillis();
        int[][] arr = RangeArray(20000);

        long start = System.currentTimeMillis();
        Find1(5,arr);
        long end = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        Find2(5,arr);
        long end2 = System.currentTimeMillis();

        System.out.println(end-start);
        System.out.println(end2-start2);

    }

    public static int[][] RangeArray(int n) {
        int[][] arr = new int[n][n];
        Random random = new Random(10);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = random.nextInt();
            }
        }
        return arr;
    }

    public static long timeTest(int[] arr) {
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        return (end-start)/1000;
    }
}
