package 揭尹.CCF.窗口;

import java.util.Scanner;

/**
 * Created by Jline on 2019/4/7.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[][] arr = new int[N][5];
        for (int i = N-1; i >=0; i--) {
            for (int j = 0; j < 4; j++) {
                    arr[i][j]=sc.nextInt();
            }
            arr[i][4]=N-i;
        }
        int[][] dianji = new int[M][2];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 2; j++) {
                    dianji[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(dianji[i][0]>=arr[j][0]&&dianji[i][0]<=arr[j][2]
                        &&dianji[i][1]>=arr[j][1]
                        &&dianji[i][1]<=arr[j][3]) {
                    System.out.println(arr[j][4]);
                    swap(arr, j);
                    break;
                }
                if(j==N-1)
                    System.out.println("IGNORED");
            }

        }
    }

    private static void swap( int[][] arr, int j ) {
        int[] flag = arr[j];
        for (int k = j; k>=1; k--) {
            arr[k]=arr[k-1];
        }
        arr[0]=flag;
    }
}
