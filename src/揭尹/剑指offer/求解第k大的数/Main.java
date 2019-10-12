package 揭尹.剑指offer.求解第k大的数;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/20
 * \* Time: 18:16
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Main {
    public static void main( String[] args ) {

        int[] arr =new int[1000];
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            arr[i]= (int) (Math.random()*1000+1);
        }
        method(arr,100);

        method1(arr,100);

    }

    private static void method1( int[] arr, int k ) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]<arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        System.out.println(arr[k-1]);
        long end = System.currentTimeMillis();
        System.out.println("暴力："+(end-start));

    }

    private static void method( int[] arr, int k ) {
        long start = System.currentTimeMillis();
        for (int l=0, h=arr.length-1 ; l<h;) {
            int i =l+1,j=h;
            int v=arr[l];
            while(true){
                while(i<=h&&arr[i]>v)
                    i++;
                while(j>=l+1&&arr[j]<v)
                    j--;
                if(i>j)
                    break;
                swap(arr,i,j);
            }
            swap(arr,l,j);
            if(i==k) {
                System.out.println(arr[j]);
                break;
            }
            else if(j<k-1)
                l=j+1;
            else
                h=j-1;

        }

        long end = System.currentTimeMillis();
        System.out.println("快排："+(end-start));
    }
    private static void swap( int[] arr, int i, int j ) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
}
