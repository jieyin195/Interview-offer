package 揭尹.华为机试.最高分是多少;

        import java.util.Scanner;

/**
 * Created by Jline on 2019/4/3.
 * 华为的测试用例一定要记得加 sc.hasNext();
 */
public class Solution {
    public static void main( String[] args ) {
        Scanner sc =new Scanner(System.in);
        int N=0,M=0;
        while(sc.hasNext()) {
             N = sc.nextInt();
             M = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < M; i++) {
                String Q = sc.next();
                int A = sc.nextInt();
                int B = sc.nextInt();
                if (Q.equals("Q")) {
                    System.out.println(maxArr(arr, A, B));
                }
                if (Q.equals("U")) {
                    arr[A - 1] = B;
                }
            }
        }
    }

    private static int maxArr( int[] arr ,int A ,int B) {
        int temp;
        temp = Math.min(A,B);
        B=Math.max(A,B);
        A=temp;
        int max=0;
        for (int i = A-1; i < B; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
