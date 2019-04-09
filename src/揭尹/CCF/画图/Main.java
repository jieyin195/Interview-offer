package 揭尹.CCF.画图;

import java.util.Scanner;

/**
 * Created by Jline on 2019/4/7.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr= new int[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                arr[i][j]=-1;
            }
        }
        int[][] arr2 = new int[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int x =arr2[i][0] ; x < arr2[i][2]; x++) {
                for (int y = arr2[i][1]; y < arr2[i][3]; y++) {
                    arr[x][y]=1;
                }
            }
        }
        int count=0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(arr[i][j]==1)
                    count++;
            }
        }
        System.out.println(count);
    }
}
