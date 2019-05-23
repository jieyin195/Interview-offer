package 揭尹.剑指offer.调整数组顺序使奇数位于偶数前面;

import java.util.Scanner;

/**
 * Created by Jline on 2019/4/2.
 */
public class Solution {

    public static void reOrderArray(int [] array) {
        int[] arr = new int[array.length];
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0)
                arr[count++]=array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0)
                arr[count++]=array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i]=arr[i];
        }
    }
}
