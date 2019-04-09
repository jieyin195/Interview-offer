package 揭尹.CCF.图像旋转;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jline on 2019/4/8.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = m-1; j >= 0; j--) {
                arr[i][j]=sc.nextInt();

            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

    }
}
