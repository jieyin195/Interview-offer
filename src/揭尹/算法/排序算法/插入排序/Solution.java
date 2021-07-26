package 揭尹.算法.排序算法.插入排序;

import 揭尹.算法.排序算法.Config;

public class Solution {
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j>0 && arr[j]<arr[j-1] ; j--) {
                Config.swap(arr,j,j-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{6,2,9,5,3,8,1};
        Config.printArr(arr);
        insertionSort(arr);
        Config.printArr(arr);
    }
}
