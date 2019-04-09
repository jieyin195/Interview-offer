package 揭尹.CCF.Z字形扫描;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jline on 2019/4/7.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int flag = 1;
        int count = 1;
        System.out.print(arr[0][0]+" ");
        while (count++ <= (2 * n - 1)) {
                if(flag==1){
                    for (int i = 0; i < count; i++) {
                        if(i<n&&count-1-i<n)
                            System.out.print(arr[i][count-1-i]+" ");
                    }
                    flag=0;

            }
            else {
                    for (int i = 0; i < count; i++) {
                        if(i<n&&count-1-i<n)
                            System.out.print(arr[count-1-i][i]+" ");
                    }
                    flag=1;
                }


        }
    }
}
