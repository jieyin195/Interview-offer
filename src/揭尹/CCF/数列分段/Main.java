package 揭尹.CCF.数列分段;

import java.util.Scanner;

/**
 * Created by Jline on 2019/4/8.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int count=1;
        for (int i = 1; i <n ; i++) {
            if(arr[i-1]!=arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
