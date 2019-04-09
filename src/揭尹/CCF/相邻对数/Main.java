package 揭尹.CCF.相邻对数;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Jline on 2019/4/7.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-arr[i-1]==1)
                count++;
        }
        System.out.println(count);
    }
}
