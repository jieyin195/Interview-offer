package 揭尹.华为机试.喝汽水瓶;

import java.util.Scanner;

/**
 * Created by Jline on 2019/4/4.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            int sum=0;

            while(N>2) {
                int temp = N / 3;
                sum += temp;
                if(N%3!=0){
                    N=temp+N%3;
                }else {
                    N=temp;
                }
            }
            if(N==2)
                sum+=1;
            System.out.println(sum);
        }
    }
}
