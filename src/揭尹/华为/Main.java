package 揭尹.华为;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String binaryString = Integer.toBinaryString(number);
        String[] strings = binaryString.split("0+"); //再将字符串按多个0分割
        int count = 0;
        for (String string : strings) {
            count = Math.max(count, string.length());
        }
        System.out.println(count);
    }
}
