package 揭尹.算法.排序算法.希尔排序;

import 揭尹.算法.排序算法.Config;

public class Solution {
    /**
     * 交换法
     * @param arr
     */
    public static void shellSort1(int[] arr){
        for (int gap = arr.length/2; gap>=1 ; gap/=2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while(j-gap>=0 && arr[j]<arr[j-gap]){
                    Config.swap(arr,j,j-gap);
                    j-=gap;
                }
            }
        }
    }

    /**
     * 移动法
     * @param arr
     */
    public static void shellSort2(int[] arr){
        for (int gap = arr.length/2; gap>=1 ; gap/=2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int tmp = arr[j];
                if(arr[j]<arr[j-gap]){
                    while(j-gap>=0 && tmp<arr[j-gap]){
                        arr[j] = arr[j-gap];
                        j-=gap;
                    }
                    arr[j]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,2,9,5,3,8,1};
        Config.printArr(arr);
        shellSort2(arr);
        Config.printArr(arr);
    }
}
