package 揭尹.算法.排序算法.快速排序;

import 揭尹.算法.排序算法.Config;

public class Solution {
    public static void quickSort(int[] arr , int l ,int r){
        if(l>=r)
            return;
        int index = position(arr,l,r);
        quickSort(arr,l,index-1);
        quickSort(arr,index+1,r);
    }

    private static int position(int[] arr, int l, int r) {
        int i =l,j=r;
        while(i<j){
            while(i<j && arr[j]>=arr[l]){
                j--;
            }
            while(i<j && arr[i]<=arr[l]){
                i++;
            }
            swap(arr,i,j);
        }
        swap(arr,i,l);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        quickSort(arr,0,arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }


}
