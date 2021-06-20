package 揭尹.算法.排序算法.选择排序;

import 揭尹.算法.排序算法.Config;

public class Solution {

    public void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                Config.swap(arr, min, i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,2,9,5,3,8,1};
        Config.printArr(arr);
        new Solution().selectSort(arr);
        Config.printArr(arr);
    }
}
