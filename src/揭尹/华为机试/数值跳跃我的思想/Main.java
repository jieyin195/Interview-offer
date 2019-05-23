package 揭尹.华为机试.数值跳跃我的思想;

import java.util.Scanner;

/**
 * Created by Jline on 2019/4/10.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }
            int out = 0;
            int count=0;
            int step_max=0;
            while(step_max<arr.length-1){
                count++;
                for (int i = 0; i <=out; i++) {
                    if(arr[i]+i>step_max)
                        step_max=arr[i]+i;
                }
                out=step_max;
            }
            System.out.println(count);
        }
    }
}
