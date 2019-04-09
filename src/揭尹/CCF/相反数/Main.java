package 揭尹.CCF.相反数;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Jline on 2019/4/7.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int[] arr =new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j=arr.length-1; i<j;j--) {
                if(arr[i]+arr[j]==0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
