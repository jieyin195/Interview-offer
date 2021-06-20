package 揭尹.算法.排序算法.冒泡排序;

import 揭尹.算法.排序算法.Config;

public class Solution {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    Config.swap(arr, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,2,9,5,3,8,1};
        Config.printArr(arr);
        Solution.bubbleSort(arr);
        Config.printArr(arr);
    }
}
